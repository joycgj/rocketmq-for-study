package com.alibaba.rocketmq.client.consumer.listener;

import com.alibaba.rocketmq.common.message.MessageExt;

import java.util.List;

// done
/**
 * A MessageListenerConcurrently object is used to receive asynchronously delivered messages orderly.one queue,one thread
 */
public interface MessageListenerOrderly extends MessageListener {
    /**
     * It is not recommend to throw exception,rather than returning ConsumeOrderlyStatus.SUSPEND_CURRENT_QUEUE_A_MOMENT if consumption failure
     *
     * @param msgs    msgs.size() >= 1<br>
     *                DefaultMQPushConsumer.consumeMessageBatchMaxSize=1，you can modify here
     * @param context
     * @return
     */
    ConsumeOrderlyStatus consumeMessage(final List<MessageExt> msgs,
                                        final ConsumeOrderlyContext context);
}
