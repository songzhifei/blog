package com.user.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.user.service.IUserService;
import com.user.proj.User;

@Controller
@RequestMapping("/user")
 
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model)
	{
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user",user);
		return "showUser";
	}
	@RequestMapping("/showUser2")
	public String toIndex2(HttpServletRequest request,Model model)
	{
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user",user);
		return "showUser2";
	}
	@RequestMapping("/login")
	public String toTest(HttpServletRequest request,Model model)
	{
		return "userLogin";
	}
	@RequestMapping("/test2")
	public String toTest2(HttpServletRequest request,Model model)
	{
		return "test2";
	}
	@RequestMapping("/userLogin")
	public String toLogin(HttpServletRequest request,Model model)
	{
		return "userLogin";
	}
	@RequestMapping("/LoginUser")
	public String toLoginUser(HttpServletRequest request,Model model)
	{
		return "LoginUser";
	}
}
