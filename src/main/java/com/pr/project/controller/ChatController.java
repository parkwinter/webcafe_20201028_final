package com.pr.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {
	@RequestMapping("/chat/chat")
	public String chat() {
		return "chat/chat";
	}

}
