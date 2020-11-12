package day11_MultiBranchIf;

public class NameOfTheMonth {

    public static void main(String[] args) {

        int number = 1;
        String Month = " ";

        if (number == 1) {
            Month = "January";
        } else if (number == 2) {
            Month = "February";
        } else if (number == 3) {
            Month = "March";
        } else if (number == 4) {
            Month = "April";
        } else if (number == 5) {
            Month = "May";
        } else if (number == 6) {
            Month = "June";
        } else if (number == 7) {
            Month = "July";
        } else if (number == 8) {
            Month = "August";
        } else if (number == 9) {
            Month = "September";
        } else if (number == 10) {
            Month = "October";
        } else if (number == 11) {
            Month = "November";
        } else {
            Month = "December";
        }
            System.out.println("This month is : " + Month);

    }
}
