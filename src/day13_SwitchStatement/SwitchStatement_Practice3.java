package day13_SwitchStatement;

public class SwitchStatement_Practice3 {

    public static void main(String[] args) {

        String browser ="chrome";
        String selectedBrowser  = " ";
        String selected = " BROWSER IS SELECTED";

        switch (browser){ // chrome
            case "chrome":
                selectedBrowser = "CHROME"+selected;
                break;
            case "firefox":
                selectedBrowser="FIREFOX"+selected;
                break;
            case "opera":
                selectedBrowser="OPERA"+selected;
                break;
            case "safari":
                selectedBrowser="SAFARI"+selected;
                break;
            case "edge":
                selectedBrowser="EDGE"+selected;
                break;
            case "ie":
                selectedBrowser="IE"+selected;
                break;

            default:
                selectedBrowser="INVALID";
                break;
        }

        System.out.println(selectedBrowser);
    }
}
/*
3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
             Ex:
                browserName = "chrome";
                output:
                    Chrome Browser is Selected

 */
