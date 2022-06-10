package com.saitej.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonalDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(now);

     
    }
}
