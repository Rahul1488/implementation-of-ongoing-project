package com.technoelevate.crudoperation.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.technoelevate.crudoperation.dto.AdminDto;
import com.technoelevate.crudoperation.dto.UserDto;
import com.technoelevate.crudoperation.service.AdminService;
import com.technoelevate.crudoperation.service.UserService;

@Controller
public class AdminController {

	@Autowired
	AdminService adminService;
	@Autowired
	UserService userService;

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String adminLogin(ModelMap map, AdminDto dto, HttpServletRequest req) {

		if (dto != null) {
			adminService.login(dto);
			HttpSession msg = req.getSession();
			msg.setAttribute("msg1", dto);
			map.addAttribute("Key", dto.getName());
			return "logindata";
		} else {
			String msg = "something went wrong";

			map.addAttribute("Key", msg);
			return "login";
		}
	}

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap map) {

		session.invalidate();
		map.addAttribute("Key", "please login first");
		return "login";
	}

	@GetMapping("/insert")
	public String addUser() {
		return "insert";
	}

	@PostMapping("/insert")
	public String addUserData(ModelMap map, UserDto dto, HttpServletRequest request) {

		userService.addUser(dto);
		if (dto != null) {
			HttpSession session = request.getSession();
			session.setAttribute("msg1", dto);
			map.addAttribute("Key", dto.getUserId());
			return "insert";
		}
		String msg = "something went wrong please login first";
		map.addAttribute("Key", msg);
		return "login";
	}
}