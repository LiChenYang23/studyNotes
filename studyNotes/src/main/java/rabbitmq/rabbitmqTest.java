package rabbitmq;

import com.rabbitmq.client.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class rabbitmqTest {

    public static Connection GetRabbitConnection() {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUsername("guest");
        factory.setPassword("guest");
        factory.setHost("localhost");
        Connection conn = null;
        try {
            conn = factory.newConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    @Test
    public void test() {
        Publisher(); // 推送消息

        Consumer(); // 消费消息
    }

    /**
     * 推送消息
     */
    public static void Publisher() {
        // 创建一个连接
        Connection conn = GetRabbitConnection();
        if (conn != null) {
            try {
                // 创建通道
                Channel channel = conn.createChannel();
                // 声明队列【参数说明：参数一：队列名称，参数二：是否持久化；参数三：是否独占模式；参数四：消费者断开连接时是否删除队列；参数五：消息其他参数】
                channel.queueDeclare("testQueues", false, false, false, null);
                String content = "test1234 + lcy";
                // 发送内容【参数说明：参数一：交换机名称；参数二：队列名称，参数三：消息的其他属性-routing headers，此属性为MessageProperties.PERSISTENT_TEXT_PLAIN用于设置纯文本消息存储到硬盘；参数四：消息主体】
                channel.basicPublish("", "testQueues", null, content.getBytes("UTF-8"));
                System.out.println("已发送消息：" + content);
                // 关闭连接
                channel.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 消费消息
     */
    public static void Consumer() {
        // 创建一个连接
        Connection conn = GetRabbitConnection();
        if (conn != null) {
            try {
                // 创建通道
                Channel channel = conn.createChannel();
                // 声明队列【参数说明：参数一：队列名称，参数二：是否持久化；参数三：是否独占模式；参数四：消费者断开连接时是否删除队列；参数五：消息其他参数】
                channel.queueDeclare("testQueues", false, false, false, null);

                // 创建订阅器，并接受消息
                channel.basicConsume("testQueues", false, "", new DefaultConsumer(channel) {
                    @Override
                    public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
                                               byte[] body) throws IOException {
                        String routingKey = envelope.getRoutingKey(); // 队列名称
                        System.out.println("队列名称:"+routingKey);
                        String contentType = properties.getContentType(); // 内容类型
                        System.out.println("内容类型:"+contentType);
                        String content = new String(body, "utf-8"); // 消息正文
                        System.out.println("消息正文：" + content);
                        channel.basicAck(envelope.getDeliveryTag(), false); // 手动确认消息【参数说明：参数一：该消息的index；参数二：是否批量应答，true批量确认小于index的消息】
                    }
                });

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
