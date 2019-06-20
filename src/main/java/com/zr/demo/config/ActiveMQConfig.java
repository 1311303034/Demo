package com.zr.demo.config;

import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

@Configuration
@EnableJms
public class ActiveMQConfig {
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("xh_queue") ;
    }
    
    @Bean
    public Topic topic() {
        return new ActiveMQTopic("xh_topic") ;
    }
}