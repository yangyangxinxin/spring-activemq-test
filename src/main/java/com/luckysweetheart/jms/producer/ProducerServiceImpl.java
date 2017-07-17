package com.luckysweetheart.jms.producer;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * Created by yangxin on 2017/7/17.
 */
public class ProducerServiceImpl implements ProducerService {

    @Resource
    private JmsTemplate jmsTemplate;

    //@Resource(name="activeMQQueue") // 队列模式的地址
    @Resource(name="topicDestination") // 主题模式的地址
    private Destination destination;

    public void sendMessage(final String message) {
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }
        });
        System.out.println("发送消息:" + message);

    }
}
