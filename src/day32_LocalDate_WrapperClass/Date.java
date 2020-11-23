package day32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class Date {

    public static void main(String[] args) {

        LocalDate yesterday = LocalDate.of(2020,11,22);

        System.out.println(yesterday);

        //LocalDate d1= LocalDate.of(2020,2,30);
        // Invalid because February does not have 30 days
        //System.out.println(d1);

        System.out.println(yesterday.isLeapYear()); // Leap ===> true, otherwise ===> false.

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate DofB= LocalDate.of(1999,2,23);

        System.out.println(DofB.isLeapYear());

        String[] Classmates = {"rinat","almira","daniyar","ayni","epan"};
        LocalDate[] DateOfBirth = {
                LocalDate.of(1997,11,17),
                LocalDate.of(1999,2,23),
                LocalDate.of(2000,12,12),
                LocalDate.of(1998,8,12),
                LocalDate.of(1996,2,4)};

        for(int i=0; i<=Classmates.length-1; i++){
            System.out.println(Classmates[i]+" : "+DateOfBirth[i]);
        }
    }
}
