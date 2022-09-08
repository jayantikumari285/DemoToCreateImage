package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ResponseMsg;

@RestController
public class DemoApplicationController {
	
	@GetMapping("/helloworld")
	public ResponseMsg helloWorld()
	{
		ResponseMsg responseMsgObj = new ResponseMsg();
		
		responseMsgObj.setMsg("Hello world");
		return responseMsgObj;
	}

}
