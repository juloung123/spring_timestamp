package com.example.timestamp.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Baseexception extends Exception{
    public Baseexception(String code){
        super(code);
    }
}
