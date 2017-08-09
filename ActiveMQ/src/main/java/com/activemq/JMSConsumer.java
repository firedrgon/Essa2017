package com.activemq;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by Yuanping on 2017/3/23.
 */
public class JMSConsumer {
    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
    private static final String BROKEURL = ActiveMQConnection.DEFAULT_BROKER_URL;

    public static void main(String[] args) {
        ConnectionFactory connectionFactory; //连接工厂
        Connection connection = null;  //连接
        Session session;
        Destination destination; //消息的目的地
        MessageConsumer messageConsumer;

        connectionFactory = new ActiveMQConnectionFactory(JMSConsumer.USERNAME, JMSConsumer.PASSWORD, JMSConsumer.BROKEURL);

        try {
            connection = connectionFactory.createConnection();
            connection.start();

            session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
//            destination = session.createQueue("FirstQueue1");
            destination = session.createTopic("FirstTopic1");
            messageConsumer = session.createConsumer(destination);

            messageConsumer.setMessageListener(new Listerner1());

        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
