package Office_Hours.Practice_11_27_2020;

public class RemovesSpecialCharacters {

    public static void main(String[] args) {

        String str="ab!cd#$e@fg$*hijkl^123456&";

        String result = "";

        for(char each : str.toCharArray()){
            if(Character.isLetterOrDigit(each)){ //if i want only special characters, i  just need ot add ! infront
                result += each;
            }
        }
        System.out.println(result);

    }
}
