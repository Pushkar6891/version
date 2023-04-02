package com.company.eg005.dateandtime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTimeTester {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        int date = gregorianCalendar.get(Calendar.DATE);
        int month = gregorianCalendar.get(Calendar.MONTH);
        int year = gregorianCalendar.get(Calendar.YEAR);

        int second = gregorianCalendar.get(Calendar.SECOND);
        int minute = gregorianCalendar.get(Calendar.MINUTE);
        int hour = gregorianCalendar.get(Calendar.HOUR);

        System.out.println(date + "/" + (month + 1) + "/" + year);
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
