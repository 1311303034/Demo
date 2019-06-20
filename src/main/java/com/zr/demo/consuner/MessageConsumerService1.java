package com.zr.demo.consuner;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumerService1 {
	 @JmsListener(destination="xh_topic")
	    public void receiveMessage(String text) {    // 进行消息接收处理
	        System.err.println("【*** 消费者2接收消息 ***】" + text);
	    }
}
