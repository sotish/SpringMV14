package com.sat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sat.bean.myBean;

@Controller

public class helloController {

	@RequestMapping(value = "/hello")
	public ModelAndView helloWorld(Model model) {


		ModelAndView mav = new ModelAndView();
		mav.setViewName("showMessage");
		String msg = "hello from message controller";
		mav.addObject("myVar", msg);

		  return mav;

	}

	@RequestMapping(value = "/bean")
	public ModelAndView helloBean(Model model) {

		 myBean mb= new myBean();
		 mb.setName("mike" );

		ModelAndView mav = new ModelAndView();
		mav.setViewName("showBean");

		mav.addObject("myVar", mb);

		  return mav;

	}


}
