package day22_JavaRecap;

public class 重要RemoveDuplicates {
//interview question
    public static void main(String[] args) {
        String str ="ABBCCDDDDDDDDEEEEEEFFFFFF";
        String result="";  // "AB"

        for(int i=0; i <= str.length()-1; i++) {
          // begIndex        lastIndex

            String eachCharacter = ""+str.toUpperCase().charAt(i);// gets each character one by one.
              // because String, so we need "".

    //第一种：
            if(result.contains(eachCharacter)){ //if the character is already contained in the result, we will be skip the character.
                continue;//skip 如果已经contain了就过.
            }else{ //if the character of str is not contained in the result yet, then we concate the character.
                result += eachCharacter;
            }

/*
    第二种： if(!result.contains(eachCharacter)){
                result+=eachCharacter;
            }
 */
        }
        System.out.println("result = " + result);

    }
}
