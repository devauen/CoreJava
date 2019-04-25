package com.proartz.Chapter2.Exercise11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.lang.System.*;
import static java.time.LocalDate.*;


public class Cal {
    public static void main(String[] args) {
        LocalDate date = now().withDayOfMonth(1);
        int month;
        if (args.length >= 2) {        
            month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            date = of(year, month, 1);
        } else {
            month = date.getMonthValue();
        }
        
        out.println(" Sun Mon Tue Wed Thu Fri Sat");
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
        value = (value + 1) % 7;
        for (int i = 1; i < value; i++) 
            out.print("    ");
        while (date.getMonthValue() == month) {
            out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 7)
                out.println();
        }
        if (date.getDayOfWeek().getValue() != 7)
           out.println();
    }
}
