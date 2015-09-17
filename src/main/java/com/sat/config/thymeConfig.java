package com.sat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class thymeConfig {


	public ViewResolver viewResolver(){

	ClassLoaderTemplateResolver tempResolver= new ClassLoaderTemplateResolver();
	tempResolver.setTemplateMode("XHTML");
	tempResolver.setPrefix("/view");
	tempResolver.setSuffix(".html");

	SpringTemplateEngine engine= new SpringTemplateEngine();
	engine.setTemplateResolver(tempResolver);

	ThymeleafViewResolver viewResolver= new ThymeleafViewResolver();
viewResolver.setTemplateEngine(engine);


		return viewResolver();





	}

}
