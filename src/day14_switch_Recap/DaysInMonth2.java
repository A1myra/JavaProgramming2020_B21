package day14_switch_Recap;

public class DaysInMonth2 {

    public static void main(String[] args) {
        int year = 2020;
        String month = "Jan";

        String result = " ";

        switch(month){

            case "Feb":
                result = (year%4==0)?"29 days":"28 days";
                break;

            case"Apr":
            case"Jun":
            case"Sep":
            case"Nov":
                result ="30 days"; // this is the or logic in switch statement ||.
                break;

            case"Jan":
            case"Mar":
            case"May":
            case"Jul":
            case"Aug":
            case"Oct":
            case"Dec":
                result ="31 days";
                break;

            default:
                result="Invalid Month";
        }

        System.out.println(result);


    }
}
