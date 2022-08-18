package com.example.timestamp.business;

import com.example.timestamp.Entity.Timestamp;
import com.example.timestamp.exception.Baseexception;
import com.example.timestamp.mapper.TimestampMapper;
import com.example.timestamp.model.TimestampModel;
import com.example.timestamp.service.TimestampService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Slf4j
@Service
public class TimestampBusiness {
    @Autowired
    private TimestampService timestampService;
    private TimestampMapper timestampMapper;
    public TimestampModel register() {
        Timestamp timestamp = timestampService.create();
        log.info("TimestampBusiness info");
        return timestampMapper.toRegisterResponse(timestamp);
    }
}
