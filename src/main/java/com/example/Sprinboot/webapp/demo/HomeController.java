package com.example.Sprinboot.webapp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("home")
//	@ResponseBody - to return the data- prints home.jsp
	public String show()
	{
		
		//System.out.println("hi");
		/*Spring boot doesnt recognise jsp pages now, rest apis are used. to 
		use jsp.. search mvn repository ..search tomcat jasper and copy the 
		the dependency for the tomacat version used in spring boot 
		*/
		return "home.jsp"; 
		
	}

}
