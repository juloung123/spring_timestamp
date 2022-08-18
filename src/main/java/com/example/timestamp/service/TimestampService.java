package com.example.timestamp.service;

import com.example.timestamp.Entity.Timestamp;
import com.example.timestamp.exception.Baseexception;
import com.example.timestamp.repository.TimestampRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.UUID;

@Slf4j
@Service
public class TimestampService {

    @Autowired
    private TimestampRepository repository;

    public TimestampService(TimestampRepository repository){
        this.repository=repository;
    }

    public Timestamp create() {
        //validate


        //verify


        //save
        Timestamp entity = new Timestamp();
        //timestamp
        LocalDateTime currnttime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        String timestamp = currnttime.format(formatter);
        //status


        entity.setTimestamp(timestamp);
        entity.setStatus(HttpStatus.EXPECTATION_FAILED.value());
        log.info("Timestampservice info");

        return repository.save(entity);
    }
}
