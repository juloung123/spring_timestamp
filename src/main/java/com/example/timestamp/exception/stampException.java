package com.example.timestamp.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class stampException extends Baseexception{
    public stampException(String code) {
        super("stamp." + code);
    }

}
