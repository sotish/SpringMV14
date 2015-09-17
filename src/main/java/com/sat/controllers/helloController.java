package com.sat.controllers;

import model.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getThyme(@PathVariable String name, ModelMap model) {
		model.addAttribute("name", name);
		return "thyme";
	}

	@RequestMapping(value = "/bean")
	public ModelAndView helloBean(Model model) {
		myBean mb = new myBean();
		mb.setName("mike");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("showBean");
		mav.addObject("myVar", mb);
		return mav;
	}

	@RequestMapping(value = "/greeting")
	public String greeting(
			@RequestParam(value = "myName", required = false, defaultValue = "Satish") String myName,
			Model model) {
		model.addAttribute("myAttr", myName);
		return "view/jsp/greeting";
	}

	// ***** controller for info page-------

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Student student,
			ModelMap model) {
		model.addAttribute("id", student.getId());
		model.addAttribute("name", student.getFirstName());
		model.addAttribute("age", student.getAge());
		return "result";
	}

}
