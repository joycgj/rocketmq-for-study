study ThreadLocal
study effective java

    @Override
    public int compareTo(MessageQueue o) {
        {
            int result = this.topic.compareTo(o.topic);
            if (result != 0) {
                return result;
            }
        }

        {
            int result = this.brokerName.compareTo(o.brokerName);
            if (result != 0) {
                return result;
            }
        }

        return this.queueId - o.queueId;
    }
    
    代码块有什么作用
    
MessageSysFlag 没有理解
MessageExt ByteBuffer.allocate  byteBuffer.flip() study java nio
MessageExt inetSocketAddress.getAddress().getHostAddress()
