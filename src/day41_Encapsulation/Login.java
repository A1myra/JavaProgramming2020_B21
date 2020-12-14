package day41_Encapsulation;

public class Login {

    public static void main(String[] args) {

        Credential obj = new Credential();

        //System.out.println(obj.userName);
        //obj.userName="ABC";
        //System.out.println(obj.userName);
        System.out.println(obj.getUserName());
        System.out.println(obj.getPassWord());

        //get password() = 123456;   READ ONLY

    }
}