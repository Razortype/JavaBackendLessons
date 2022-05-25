package com.razortype.GameStoreSystem.core.result;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class DataResult<T> extends Result {

    private T data;

    public DataResult(T data, boolean success, String message) {
        super(success,message);
        this.data = data;
    }

}
