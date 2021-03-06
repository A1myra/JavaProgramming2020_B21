package day23_NestedLoop;

import java.util.Scanner;

/*
credentials:
userName:cybertek
password:cybertek12345
 */
public class Credentials {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name");
        String userName= scan.next();

        System.out.println("Enter your password");
        String password= scan.next();

        if(userName.equals("cybertek") && password.equals("cybertek12345")){
            //if the credentials are valid, user will be able to login
            System.out.println("Logged In");

        }else{ //condition for invalid user name and password

            for(int i=1; i<=3; i++) { //i: 1,2,3

                if(i==3){ // if the attempt is already 3, the account should be locked.
                    System.err.println("Your account is locked");
                    System.exit(0);  //when i reach 3, it will be terminated
                }

                System.out.println("Invalid username or password, please re enter");
                System.out.println("Enter your user name");
                userName=scan.next();
                System.out.println("Enter your password");
                password=scan.next();

                if(userName.equals("cybertek") && password.equals("cybertek12345")){
                    System.out.println("Logged In");
                    break;
                }

            }
        }



    }



}
