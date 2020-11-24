package day33_ArrayList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateTimePractice {

    public static void main(String[] args) {
        DateTimeFormatter today = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        LocalDateTime d1 = LocalDateTime.of(2020,11,24,13,00);
        System.out.println(d1.format(today));

        System.out.println("======================================================");
        LocalDate[] days = new LocalDate[10];
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd, EEEE");
        for(int i =0; i<= days.length-1; i++){
            days[i] = LocalDate.now().plusDays(i);
        }
        System.out.println(Arrays.toString(days));
        for(LocalDate each : days){
            System.out.println(each.format(df));
        }


        System.out.println("======================================================");
        String[] names = {"Rinat","Almira","Dani","Ayni","Umut"};
        LocalDate[] DofB = {LocalDate.of(1997,11,17),LocalDate.of(1999,2,23),
                LocalDate.of(2001,12,12),LocalDate.of(1998,8,12),
                LocalDate.of(2002,9,5)};

        String nameOfOlder = names[0];
        LocalDate ageOfOlder =  DofB[0];

        String nameOfYoungest = names[0];
        LocalDate ageOfyoungest = DofB[0];

        for(int i =0; i<=DofB.length-1; i++){

            if(DofB[i].isBefore(ageOfOlder)){
                ageOfOlder = DofB[i];
                nameOfOlder=names[i];
            }

            if(DofB[i].isAfter(ageOfyoungest)){
                ageOfyoungest=DofB[i];
                nameOfYoungest=names[i];
            }
        }


        System.out.println(nameOfOlder+" : "+ageOfOlder);

        System.out.println(nameOfYoungest+" : "+ageOfyoungest);




    }
}
 /*1. use the LocalDate & Time get the date and time in the following format:
    Tuesday, 1:00 pm, Nov/24/2020

   2. create an array of LocalDate and store the next 10 day's dates, use for each loop to print each Date in the following formar:
         MonthName/Day, Name
                ex:
                    November/25, Wednesday
  */
