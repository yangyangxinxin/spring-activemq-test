package com.luckysweetheart.jms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 主题模式下，要启动消费者（订阅者），否则接收不到消息
 * Created by yangxin on 2017/7/17.
 */
public class AppConsumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
    }

}
