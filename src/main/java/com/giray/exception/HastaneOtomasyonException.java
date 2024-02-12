package com.giray.exception;

import lombok.Getter;

@Getter
public class HastaneOtomasyonException extends RuntimeException{

    private final ErrorType errorType;
    public HastaneOtomasyonException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public HastaneOtomasyonException(ErrorType errorType, String message){
        super(message);
        this.errorType = errorType;
    }

}
