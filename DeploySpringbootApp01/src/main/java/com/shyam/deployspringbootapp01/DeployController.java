package com.shyam.deployspringbootapp01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployController {

	@RequestMapping("/")
	public String home()
	{
		return "Project Deployment Success";
	}
}
