package com.example.timestamp.service;

import com.example.timestamp.Entity.Timestamp;
import com.example.timestamp.exception.Baseexception;
import com.example.timestamp.exception.stampException;
import com.example.timestamp.repository.TimestampRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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

    public Timestamp create() throws Baseexception{
        //validate


        //verify

        //save
        Timestamp entity = new Timestamp();
        //timestamp
        LocalDateTime currnttime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        String timestamp = currnttime.format(formatter);
        //status
//        RestTemplate template = new RestTemplate();
//        ResponseEntity<String> checkhttp = template.getForEntity("http://localhost:8080/timestamp", String.class);
//        Integer statuscode = checkhttp.getStatusCodeValue();

        entity.setTimestamp(timestamp);

        log.info("Timestampservice info");
        try{
            entity.setStatus(HttpStatus.OK.value());
            return repository.save(entity);
        }catch (Exception e){
            entity.setStatus(HttpStatus.EXPECTATION_FAILED.value());
            throw stampException.database();
        }

    }
}
