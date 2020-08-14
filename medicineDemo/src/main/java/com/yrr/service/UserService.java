package com.yrr.service;

import com.yrr.bean.User;
import com.yrr.bean.UserExample;
import com.yrr.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int addUser(User user){
        return userMapper.insert(user);
    }

    public String findByName(String username){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<User> list = userMapper.selectByExample(userExample);
        if(list.size()==0){
            return "fail";
        }
        return "success";
    }

    public String findByNameAndPwd(String username,String userpwd){
        try {
        	UserExample userExample = new UserExample();
            userExample.createCriteria().andUsernameEqualTo(username);
            List<User> list = userMapper.selectByExample(userExample);
            if(list.size()==1){
                User user = list.get(0);
                if(userpwd.equals(user.getUserpwd())){
                    return "success";
                }
            }
            return "fail";
        }catch(Exception e)
        {
        	e.printStackTrace();
        	return "fail";
        }
    }

}