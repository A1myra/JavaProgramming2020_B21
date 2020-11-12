package day13_SwitchStatement;

public class monthSwitch {
    public static void main(String[] args) {
        int months=11;
        String nameOfmonth="";
        switch (months) {
            case (1):
                nameOfmonth="jen";
                break;
            case (2):
                nameOfmonth="feb";
                break;

            case (3):
                nameOfmonth="march";
                break;
            case (4):
                nameOfmonth="april";
                break;
            case (5):
                nameOfmonth="may";
                break;
            case (6):
                nameOfmonth="june";
                break;

            case (7):
                nameOfmonth="jully";
                break;
            case (8):
                nameOfmonth="aug";
                break;
            case (9):
                nameOfmonth="sep";
                break;
            case (10):
                nameOfmonth="october";
                break;

            case (11):
                nameOfmonth="november";
                break;
            case (12):
                nameOfmonth="dec";
                break;
            default:
                nameOfmonth="Invalid";

        }
        System.out.println(nameOfmonth);
    }
}


