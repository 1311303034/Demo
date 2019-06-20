package com.zr.demo.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zr.demo.producer.IMessageProducerService;
import com.zr.demo.service.UserService;
import com.zr.model.User;


//@SpringBootTest(classes = StartSpringBootMain.class)
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
@RestController
public class MainController {
	@Autowired
	private UserService userservice;

	@RequestMapping(value = "/")
	User home() {
		return userservice.selectUserById(1);
	}

	@Autowired
	private IMessageProducerService messageProducer;

	@RequestMapping(value = "/abc")
	public void testSend() throws Exception {
		for (int x = 0; x < 10; x++) {
			this.messageProducer.sendMessage1("study - " + x);
		}
	}
	

    
//    @Resource
//    private JavaMailSender javaMailSender ;
//    @RequestMapping(value = "/bcd")
//    public void testSendMail() {
//        SimpleMailMessage message = new SimpleMailMessage() ;    // 要发送的消息内容
//        message.setFrom("1311303034@qq.com");
//        message.setTo("1311303034@qq.com");
//        message.setSubject("测试邮件）");
//        message.setText("好好学习，天天向上");
//        this.javaMailSender.send(message);
//    }
    
    @Autowired  
    private UserService  userService;
    @RequestMapping(value = "/redis")
	public List<User> r() {
		return userService.findAllUsers();
	}
	

	@RequestMapping(value = "/t")
	public String testwar() {
		return "helloWorld";
	}
}
