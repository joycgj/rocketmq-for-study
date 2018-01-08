package com.alibaba.rocketmq.client.consumer.store;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.common.message.MessageQueue;

import java.util.Map;
import java.util.Set;

// done
// Offset store interface
public interface OffsetStore {
    void load() throws MQClientException;

    // Update the offset,store it in memory
    void updateOffset(final MessageQueue mq, final long offset, final boolean increaseOnly);

    // Get offset from local storage
    long readOffset(final MessageQueue mq, final ReadOffsetType type);

    // Persist all offsets, may be in local storage or remote name server
    void persistAll(final Set<MessageQueue> mqs);

    // Persist the offset,may be in local storage or remote name server
    void persist(final MessageQueue mq);

    void removeOffset(MessageQueue mq);

    Map<MessageQueue, Long> cloneOffsetTable(String topic);
}
