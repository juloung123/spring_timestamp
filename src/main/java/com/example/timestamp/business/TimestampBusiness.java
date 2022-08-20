package com.example.timestamp.business;

import com.example.timestamp.Entity.Timestamp;
import com.example.timestamp.exception.Baseexception;
import com.example.timestamp.exception.stampException;
import com.example.timestamp.mapper.TimestampMapper;
import com.example.timestamp.model.TimestampModel;
import com.example.timestamp.service.TimestampService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TimestampBusiness {
    @Autowired
    private TimestampService timestampService;

    public Timestamp register() throws Baseexception {
        try{
            Timestamp timestamp = timestampService.create();
            log.info("TimestampBusiness info");
            return timestamp;
        }catch(Exception e){
            log.error("timestamp Bussiness fail");
            throw stampException.business();
        }
    }
}
