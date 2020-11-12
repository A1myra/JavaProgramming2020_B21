package day13_SwitchStatement;

public class browsers {

    public static void main(String[] args) {
        String browserName = "chrome";

        boolean valid = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge" || browserName == "ie";

        String selectedBrowser = "";

        if (valid) {
            if (browserName == "chrome") {
                selectedBrowser="CHROME BROWSER IS SELECTED";
            } else if (browserName == "firefox") {
                selectedBrowser="FIREFOX BROWSER IS SELECTED";
            } else if (browserName == "opera") {
                selectedBrowser="OPERA BROWSER IS SELECTED";
            } else if (browserName == "safari") {
                selectedBrowser="SAFARI BROWSER IS SELECTED";
            } else if (browserName == "edge") {
                selectedBrowser="EDGE BROWSER IS SELECTED";
            } else {
                selectedBrowser="INTERNET EXPLORE BROWSER IS SELECTED";
            }


        } else {
            selectedBrowser="no such a browser";
        }

        System.out.println(selectedBrowser);
    }
}