package MyOwnPackage;

public class RemoveDuplicates {
    /*
    removeDup("AAABBBCCC")  ==> ABC
     */


    public static void main(String[] args) {
        withoutDup("AABBCC");
    }


    public static void withoutDup(String str){
        String result ="";
        //for(String each: str.split("")){
            for(int i=0; i<=str.length(); i++){
            if(!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
            }
        System.out.println(result);

    }
}