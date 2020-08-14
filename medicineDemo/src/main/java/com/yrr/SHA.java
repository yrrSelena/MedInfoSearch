package com.yrr;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
public class SHA {
	private static final String md5 = "MD5";
	private static final String sha1 = "SHA-1";
	/**
	 * @desc 计算字符串的md5 or sha1
	 * @param str
	 * @param method,md5
	 *            or sha1
	 * @return
	 * @throws UnsupportedEncodingException
	 * 
	 */
	public static String md5OrSha1OfString(String str, String method)
			throws UnsupportedEncodingException {
            if(str==null||str.equals(""))return "";
		try {
			MessageDigest md = MessageDigest.getInstance(method);
			byte[] inputByteArr = str.getBytes("UTF-8");
			md.update(inputByteArr);
			byte[] rsByteArr = md.digest();
			return byteArrayToHex(rsByteArr);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * @desc 将生成的字节数组转化为十六进制字符串
	 * @param arr
	 * @return
	 * 
	 */
	public static String byteArrayToHex(byte[] arr) {
		String hexStr = "0123456789ABCDEF";
		StringBuilder rslt = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			rslt.append(String.valueOf(hexStr.charAt((arr[i] & 0xf0) >> 4)));
			rslt.append(String.valueOf(hexStr.charAt(arr[i] & 0x0f)));
		}
		return rslt.toString();
	}
	public static void main(String args[]) throws UnsupportedEncodingException,NoSuchAlgorithmException
        {
            System.out.println(md5OrSha1OfString("1","SHA"));
            System.out.println(md5OrSha1OfString("2","SHA"));
        }
}