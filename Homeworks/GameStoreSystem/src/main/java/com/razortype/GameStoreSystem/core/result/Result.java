package com.razortype.GameStoreSystem.core.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Result {
    private boolean success;
    private String message;
}
