package com.alibaba.rocketmq.client.common;

import java.util.Random;

// done
public class ThreadLocalIndex {
    private final ThreadLocal<Integer> threadLocalIndex = new ThreadLocal<Integer>();
    private final Random random = new Random();

    public ThreadLocalIndex(int value) {

    }

    public int getAndIncrement() {
        Integer index = this.threadLocalIndex.get();
        if (null == index) {
            index = Math.abs(random.nextInt());
            if (index < 0) index = 0;
            this.threadLocalIndex.set(index);
        }

        index = Math.abs(index + 1);
        if (index < 0) index = 0;

        this.threadLocalIndex.set(index);
        return index;
    }

    @Override
    public String toString() {
        return "ThreadLocalIndex{" +
                "threadLocalIndex=" + threadLocalIndex.get() +
                '}';
    }
}
