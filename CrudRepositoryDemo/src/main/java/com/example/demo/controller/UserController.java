package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.Userdetail;

@Controller
public class UserController {
	@Autowired
	UserDAO userdao;
	
	@RequestMapping("index")
	public String user() {
		
		return "index.jsp";
	}
	@RequestMapping("addUser")
	public String addUser(Userdetail user) {
		userdao.save(user);
		//save () user model object saving in to db(user is the pojo class object)
		return "login.jsp";
	}

	@RequestMapping("getUser")
	public ModelAndView getUser(@RequestParam int id) {
	    ModelAndView mav = new ModelAndView("showUser.jsp");
	    Userdetail user = userdao.findById(id).orElse(new Userdetail());
	    mav.addObject("user", user); 
	    return mav;
	}
	
	@RequestMapping("deleteUser")
	public ModelAndView deleteUser(@RequestParam int id) {
	    ModelAndView mav = new ModelAndView("deleteUser.jsp");
	    Userdetail user = userdao.findById(id).orElse(new Userdetail());
	    userdao.deleteById(id);
	    mav.addObject("user", user); 
	    return mav;
	}
	@RequestMapping("updateUser")
	public ModelAndView updateUser(Userdetail user) {
	    ModelAndView mav = new ModelAndView("updateUser.jsp");
	   user = userdao.findById(user.getId()).orElse(new Userdetail());
	    userdao.deleteById(user.getId());
	    mav.addObject("user", user); 
	    return mav;
	}

}
 
