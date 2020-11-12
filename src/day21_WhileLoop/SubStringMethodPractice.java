package day21_WhileLoop;

public class SubStringMethodPractice {

    public static void main(String[] args) {
        String email = "John_Daniel@Apple.com";
        int indexOf_  = email.indexOf("_"); //ending index of john.
        int indexOfAt= email.indexOf("@");

        String lastName= email.substring(0,  indexOf_);
                                    // beginning         ending index

        String firstName = email.substring(indexOf_+1, indexOfAt);// ending index of john +1 is beginning index of daniel.

        String domain = email.substring(indexOfAt+1, email.lastIndexOf("."));

        String fullName= firstName+lastName;
        System.out.println("lastName = " + lastName);
        System.out.println("firstName = " + firstName);
        System.out.println("domain = " + domain);
        System.out.println("fullName = " + fullName);

    }
}
/*
lastName_firstName@company.com
create SubString for firstName and lastName and companyName
 */