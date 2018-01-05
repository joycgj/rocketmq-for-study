package com.alibaba.rocketmq.client.consumer.listener;

/**
 * @author chengaojie
 *         2018/1/5
 */
public interface MessageListenerConcurrently extends MessageListener {
    ConsumeConcurrentlyStatus consumeMessage();
}
