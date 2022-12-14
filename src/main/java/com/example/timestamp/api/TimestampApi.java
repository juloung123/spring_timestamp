package com.example.timestamp.api;

import com.example.timestamp.Entity.Timestamp;
import com.example.timestamp.business.TimestampBusiness;
import com.example.timestamp.exception.Baseexception;
import com.example.timestamp.exception.stampException;
import com.example.timestamp.model.TimestampModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@Slf4j
@RestController
@RequestMapping("/timestamp")
public class TimestampApi {
    @Autowired
    private TimestampBusiness timebusiness;

    @GetMapping
    public ResponseEntity<Timestamp> gettimestamp() throws Baseexception {
        Timestamp response = timebusiness.register();
        log.info("gettimestamp Api info");
        try{
            return ResponseEntity.ok(response);
        }catch (Exception e){
            log.error("Timestamp api error");
            throw stampException.api();
        }
    }
    //
}
