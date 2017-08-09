package com.activemq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by Yuanping on 2017/3/23.
 */
public class Listerner2 implements MessageListener {
    @Override
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage)message;
        try {
            System.out.println("订阅者2收到的消息:" + textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
