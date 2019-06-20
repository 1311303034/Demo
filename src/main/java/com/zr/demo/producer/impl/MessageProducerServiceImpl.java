package com.zr.demo.producer.impl;

import javax.annotation.Resource;
import javax.jms.Queue;
import javax.jms.Topic;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import com.zr.demo.producer.IMessageProducerService;

@Service
public class MessageProducerServiceImpl implements IMessageProducerService{
	@Resource
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Resource
    private Queue queue;
    @Override
    public void sendMessage(String msg) {
        this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
    }

    @Resource
    private Topic topic;
    @Override
    public void sendMessage1(String msg) {
        this.jmsMessagingTemplate.convertAndSend(this.topic, msg);
    }

}
