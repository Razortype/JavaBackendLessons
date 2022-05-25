package com.razortype.GameStoreSystem.core.result;

public class ErrorDataResult<T> extends DataResult{
    public ErrorDataResult(T data,String message) {
        super(data,true, message);
    }

    public ErrorDataResult(T data) {
        super(data,false, null);
    }

    public ErrorDataResult(String message) {
        super(null,false, message);
    }
}
