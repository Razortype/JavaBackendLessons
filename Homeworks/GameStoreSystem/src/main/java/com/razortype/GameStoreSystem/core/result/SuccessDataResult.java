package com.razortype.GameStoreSystem.core.result;

public class SuccessDataResult<T> extends DataResult<T>{

    public SuccessDataResult(T data,String message) {
        super(data,true, message);
    }

    public SuccessDataResult(T data) {
        super(data,true, null);
    }

    public SuccessDataResult(String message) {
        super(null,true, message);
    }
}
