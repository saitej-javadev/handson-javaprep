package com.saitej.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class NextWednesday {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        LocalDate date = today.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println("date = " + date);
    }
}
