package com.activemq;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by Yuanping on 2017/3/23.
 */
public class JMSProducer {
    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
    private static final String BROKEURL = ActiveMQConnection.DEFAULT_BROKER_URL;
    private static final int SENDNUM = 10;  //发送的消息数量

    public static void main(String[] args) {
        ConnectionFactory connectionFactory; //连接工厂
        Connection connection = null;  //连接
        Session session;
        Destination destination; //消息的目的地
        MessageProducer messageProducer; //消息生产者

        connectionFactory = new ActiveMQConnectionFactory(JMSProducer.USERNAME, JMSProducer.PASSWORD, JMSProducer.BROKEURL);

        try {
            connection = connectionFactory.createConnection();
            connection.start();
            session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
//            destination = session.createQueue("FirstQueue1");
            destination = session.createTopic("FirstTopic1");
            messageProducer = session.createProducer(destination);
            sendMessage(session, messageProducer);
            session.commit();
        } catch (JMSException e) {
            e.printStackTrace();
        }finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 发送的消息
     * @param session
     * @param messageProducer
     */
    public static void sendMessage(Session session, MessageProducer messageProducer) throws JMSException {
        for (int i = 0; i < JMSProducer.SENDNUM; i++) {
            TextMessage textMessage = session.createTextMessage("发送消息11:" + "ActiveMQ 发送消息" + i);
            System.out.println("发布/订阅发送消息:" + "ActiveMQ 发送消息" + i);
            messageProducer.send(textMessage);
        }
    }
}



































