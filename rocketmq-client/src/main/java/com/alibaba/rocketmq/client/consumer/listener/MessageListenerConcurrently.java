package com.alibaba.rocketmq.client.consumer.listener;

import com.alibaba.rocketmq.common.message.MessageExt;

import java.util.List;

// done
/**
 * A MessageListenerConcurrently object is used to receive asynchronously delivered messages concurrently
 */
public interface MessageListenerConcurrently extends MessageListener {
    /**
     * It is not recommend to throw exception,rather than returning ConsumeConcurrentlyStatus.RECONSUME_LATER if consumption failure
     *
     * @param msgs
     *         msgs.size() >= 1<br>
     *         DefaultMQPushConsumer.consumeMessageBatchMaxSize=1，you can modify here
     * @param context
     *
     * @return
     */
    ConsumeConcurrentlyStatus consumeMessage(final List<MessageExt> msgs,
                                             final ConsumeConcurrentlyContext context);
}
