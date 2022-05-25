package com.razortype.GameStoreSystem.core.result;

public class ErrorResult extends Result{
    public ErrorResult(String message) {
        super(false, message);
    }

    public ErrorResult() {
        super(false, null);
    }
}
