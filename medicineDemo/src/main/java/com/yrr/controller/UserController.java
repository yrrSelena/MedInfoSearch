package com.yrr.controller;

import com.yrr.SHA;
import com.yrr.bean.User;
import com.yrr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("/register")
	public String register(HttpServletRequest request, Model model) throws UnsupportedEncodingException {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String userpwd = request.getParameter("userpwd");
		String confirmpwd = request.getParameter("confirmpwd");
		if (confirmpwd.equals(userpwd)) {
			String res = userService.findByName(username);
			if (res.equals("success")) {
				model.addAttribute("msg", "userError");
			} else {
				User user = new User();
				user.setUsername(username);
				userpwd=SHA.md5OrSha1OfString(userpwd, "SHA");
				user.setUserpwd(userpwd);
				user.setEmail(email);
				userService.addUser(user);
				model.addAttribute("msg", "success");
			}
		} else {
			model.addAttribute("msg", "confirmError");
		}
		return "register";
	}

	@RequestMapping("/login")
	public void login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String username = request.getParameter("username");
		String userpwd = request.getParameter("userpwd");
		userpwd=SHA.md5OrSha1OfString(userpwd, "SHA");
		String res = userService.findByNameAndPwd(username, userpwd);
		if (res.equals("success")) {
			System.out.print("success");
			// model.addAttribute("username",username);
			request.getSession().setAttribute("status", "success");
			request.getSession().setAttribute("username", username);
			response.sendRedirect("index.jsp");
		} else {
			request.getSession().setAttribute("status", "fail");
			response.sendRedirect("login.jsp");
			
			// model.addAttribute("msg","loginError");
			// return "/WEB-INF/views/login1";
		}
	}

//    @RequestMapping("/login")
//    public String login(HttpServletRequest request, Model model){
//        String username = request.getParameter("username");
//        String userpwd = request.getParameter("userpwd");
//        String res = userService.findByNameAndPwd(username,userpwd);
//        if (res.equals("success")){
//        	System.out.print("success");
//            //model.addAttribute("username",username);
//        	request.getSession().setAttribute("username",username);
//            return "/index.jsp";
//        }
//        else{
//            model.addAttribute("msg","loginError");
//            return "/login.jsp";
//            //return "/WEB-INF/views/login1";
//        }
//    }
	@RequestMapping("/loginout")
	public void loginout(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.getSession().invalidate();
		response.sendRedirect("login.jsp");
	}
}
