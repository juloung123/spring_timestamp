package com.example.timestamp.mapper;

import com.example.timestamp.Entity.Timestamp;
import com.example.timestamp.model.TimestampModel;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface TimestampMapper {
    TimestampModel toRegisterResponse(Timestamp timestamp);
}
