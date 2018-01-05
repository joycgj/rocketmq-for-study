package com.alibaba.rocketmq.common.sysflag;

// done
public class MessageSysFlag {
    public final static int CompressedFlag = (0x1 << 0);
    public final static int MultiTagsFlag = (0x1 << 1);
    public final static int TransactionNotType = (0x0 << 2);
    public final static int TransactionPreparedType = (0x1 << 2);
    public final static int TransactionCommitType = (0x2 << 2);
    public final static int TransactionRollbackType = (0x3 << 2);


    public static int getTransactionValue(final int flag) {
        return flag & TransactionRollbackType;
    }


    public static int resetTransactionValue(final int flag, final int type) {
        return (flag & (~TransactionRollbackType)) | type;
    }


    public static int clearCompressedFlag(final int flag) {
        return flag & (~CompressedFlag);
    }
}
