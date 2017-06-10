package com.cyy.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client/01")
public class OpenApiController {
	
	
	@RequestMapping("index")
	public String index(){
		
		return "this is 01 client , server is ok.";
	}

	
	
	
}
