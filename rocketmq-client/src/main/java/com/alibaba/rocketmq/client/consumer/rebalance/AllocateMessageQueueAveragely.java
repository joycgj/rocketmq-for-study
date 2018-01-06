package com.alibaba.rocketmq.client.consumer.rebalance;

import com.alibaba.rocketmq.client.consumer.AllocateMessageQueueStrategy;
import com.alibaba.rocketmq.common.message.MessageQueue;

import java.util.List;

/**
 * Average Hashing queue algorithm
 */
public class AllocateMessageQueueAveragely implements AllocateMessageQueueStrategy {
    @Override
    public List<MessageQueue> allocate(String consumerGroup, String currentCID, List<MessageQueue> mqAll, List<String> cidAll) {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
