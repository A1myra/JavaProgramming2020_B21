package Office_Hours.Practice_11_27_2020;

public class CharacterPractice {

    public static void main(String[] args) {

        int countSpecialChars=0;
        int countLetters=0;
        int countDigits=0;

        for(int i=1; i<=Character.MAX_VALUE; i++) {
            char each = (char) i;
            if (Character.isLetter(each)) {
                //Character.isLetter(each) for printing all letters
                //System.out.print(each + " ");
                countLetters++;
            }else if(!Character.isLetterOrDigit(each)){
                countSpecialChars++;
            }else{
                countDigits++;
            }
        }
        System.out.println("countDigits = " + countDigits);
        System.out.println("countLetters = " + countLetters);
        System.out.println("countSpecialChars = " + countSpecialChars);
    }
}
