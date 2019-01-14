package com.lnx.stompwebsocket.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lnx.stompwebsocket.model.HelloMessage;

@RestController
public class WebSocketController {
	
	@Autowired
	SimpMessagingTemplate simpMessagingTemplate;
	
	@RequestMapping("/index")
	public ModelAndView login(ModelAndView mv) {
		mv.setViewName("/index");
		return mv;
	}
	
	@MessageMapping("queue/hello")
	@SendTo("/topic/first")
	public String hello(String message) {
		System.out.println(message);
		return message;
	}
	
	@MessageMapping("/queue/messaging")
	//@SendToUser("/queue/greeting")
    public void single (Principal principal) {
		System.out.println(principal.getName());
       // System.out.println(message);
       // return "asdas";
        simpMessagingTemplate.convertAndSendToUser("test","/queue/greeting","asdas");
    }


    @MessageMapping("/greeting")
    public void greeting(Principal principal){
        String reply = "hello " + principal.getName();
        System.out.println("sending " + reply);
        simpMessagingTemplate.convertAndSend("/user/{username}/reply", reply);
//        simpMessagingTemplate.convertAndSendToUser(principal.getName(),"/queue/queue1",message);
    }
}
