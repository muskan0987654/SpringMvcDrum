package com.drum.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


import jakarta.servlet.ServletContext;     
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class WebServletConfiguration implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext ctx) throws ServletException{
	
		AnnotationConfigWebApplicationContext anwebConfig = new AnnotationConfigWebApplicationContext();
		anwebConfig.register(SpringConfig.class);
		anwebConfig.setServletContext(ctx);
		
		ServletRegistration.Dynamic servlet =ctx.addServlet("dispatcher", new DispatcherServlet(anwebConfig));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");		
	}
} 
   