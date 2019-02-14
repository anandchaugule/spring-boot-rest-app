package com.techonwards.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloController {
	
	String msg = "Hi Demo ";
	@RequestMapping(value = "/api/hi", method = RequestMethod.GET, headers = "Accept=application/json"  )
	public APIDataSinglePost hello() {
		return new APIDataSinglePost("my content","my title");
	}
	
	@RequestMapping(value = "/api/hello", method = RequestMethod.GET, headers = "Accept=application/json"  )
	public String hi() {
		return msg;
	}
}

class APIDataSinglePost{
	String content;
	String title;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public APIDataSinglePost(String content, String title) {
		this.content = content;
		this.title = title;
	}
	
	
}
