package com.example.timestamp.repository;

import com.example.timestamp.Entity.Timestamp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TimestampRepository extends CrudRepository<Timestamp, String> {


}
