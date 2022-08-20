package com.example.timestamp.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class stampException extends Baseexception{
    public stampException(String code) {
        super("stamp." + code);
    }
    public static stampException database(){
        return new stampException("database.erorr");
    }
    public static stampException api(){
        return new stampException("api.erorr");
    }
}
