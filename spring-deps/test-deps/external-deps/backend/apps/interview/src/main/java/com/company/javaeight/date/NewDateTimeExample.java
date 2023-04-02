package com.company.javaeight.date;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Slf4j
public class NewDateTimeExample {
    public static void main(String[] args) {
        log.info("localDate : {}", LocalDate.now());
        log.info("localTime : {}", LocalTime.now());
        log.info("localDateTime : {}", LocalDateTime.now());
    }
}
