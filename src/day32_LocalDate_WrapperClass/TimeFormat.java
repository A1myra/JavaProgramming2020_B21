package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {

    /*
    LocalDate:
    year: yyyy
    month: mm(number),mmm(three letters -->Aug), mmmm(full name of the month)
    days: dd

    name of day: E(three letters), EEEE(full name)


    Month / Day / Year
     */
    public static void main(String[] args) {
        DateTimeFormatter df =  DateTimeFormatter.ofPattern("MMMM/dd/yyyy, EEEE");

        LocalDate today = LocalDate.now(); // 2020-11-23
        System.out.println(today);

        System.out.println(today.format(df));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();

        System.out.println(now);

        System.out.println(now.format(tf));

        LocalTime t1 = LocalTime.of(23,35);
        System.out.println(t1); //24 hours format
        System.out.println(t1.format(tf)); //Am, Pm format

        //

        //Monday 12:40 pm Nov/23/2020
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a MMM/dd/yyyy");
        LocalDateTime dt1 = LocalDateTime.of(2020,11,23,12,40);

        System.out.println(dt1);
        System.out.println(dt1.format(dtf));


        //task:
        LocalDate tomorrow = LocalDate.of(2020,11,24);
        System.out.println(tomorrow.format(df));

        boolean r1=today.isBefore(tomorrow); //true
        boolean r2=today.isAfter(tomorrow); //false
        System.out.println(r1);
        System.out.println(r2);

    }
}
