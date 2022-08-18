package com.example.timestamp.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "time_stamp")
public class Timestamp extends BaseEntity{
    @Column(nullable = false, length = 120)
    private String timestamp;

    @Column(nullable = false, length = 30)
    private Integer status;
}
