package com.ustglobal.retailerspringmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.retailerspringmvc.bean.OrderProduct;
import com.ustglobal.retailerspringmvc.bean.Product;
import com.ustglobal.retailerspringmvc.bean.User;
import com.ustglobal.retailerspringmvc.service.RetailerService;

public class RetailerController {
	@Autowired
	private RetailerService service;
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@PostMapping("/login")
	public String loginpage(String email,String password,HttpServletRequest request) {
		User user=service.login(email, password);
		if(user!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			return "home";
		}else {
			request.setAttribute("msg", "Invalid email or password");
			return "login";
		}
	}
	@GetMapping("/register")
	public String registerPage() {

		return "register";
	}

	@PostMapping("/register")
	public String register(User bean,ModelMap map) {
		boolean check=service.register(bean);
		if(check) {
			map.addAttribute("msg", "Your Registered");
		}else {
			map.addAttribute("msg", "Email is Repeated");
		}
		return "login";
	}
	@GetMapping("changepassword")
	public String change(HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		if(session!=null) {
			return "changepassword";
		}else {
			return "login";
		}
	}
	@PostMapping("changepassword")
	public String change(@SessionAttribute(name= "user", required = false) User user,ModelMap map,String password) {
		if(user!=null) {
			service.updatePassword(user.getEmail(), password);
			map.addAttribute("msg", "password changed");
			return "home";
		}else {
			map.addAttribute("msg", "Login First");
			return "login";
		}
	}
	@GetMapping("/search")
	public String search() {
		
		return "searchproduct";
	}
	@PostMapping("/search")
	public String searchproduct(@SessionAttribute(name= "user", required = false) User user,ModelMap map,String pname) {
		if(user!=null) {
			
			Product product=service.search(pname);
			if(product!=null) {
			map.addAttribute("product",product);
			return "searchproduct";
			}else {
				map.addAttribute("msg", "product not found");
				return "searchproduct";
			}
		}else {
			map.addAttribute("msg", "First Login!!!");
		return "login";
		}
	}
	@GetMapping("/buy")
	public String buy(@SessionAttribute(name= "user", required = false) User user,ModelMap map,Product product) {
		if(user!=null) {
			map.addAttribute("buy", product);
			return "buyproduct";
		}else {
			map.addAttribute("msg", "First Login");
			return "login";
		}
	}
	@PostMapping("/buy")
	public String buyproduct(@SessionAttribute(name= "user", required = false) User user,ModelMap map,Product product, int quantity) {
		if(user!=null) {
			service.buyProduct(user, product, quantity);
			map.addAttribute("msg", "product added");
			return "home";
		}else {
			map.addAttribute("msg", "First Login");
			return "login";
		}
	}
	@GetMapping("/order")
	public String order(@SessionAttribute(name= "user", required = false) User user,ModelMap map) {
		if(user!=null) {
			List<OrderProduct> list=service.getProducts(user.getEmail());
			if(list.isEmpty()) {
				map.addAttribute("msg", "No Product You Have");
				return "home";
			}else {
				map.addAttribute("orders", list);
				return "orders";
			}
		}else {
			map.addAttribute("msg", "First Login");
			return "login";
		}
	
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
	@GetMapping("/home")
	public String home(@SessionAttribute(name= "user", required = false) User user,ModelMap map) {
		if(user!=null) {
			return "home";
		}else {
			return "login";
		}
	}
}
	


