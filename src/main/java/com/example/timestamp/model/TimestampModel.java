package com.example.timestamp.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;


@Data
public class TimestampModel {
    private String timestamp;

    private int status;

}
