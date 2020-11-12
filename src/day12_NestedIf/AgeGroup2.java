package day12_NestedIf;

public class AgeGroup2 {
    public static void main(String[] args) {

        int age = 5;
        String result=" ";

        if(age>=1 && age<=2){ // it becomes false when age >= 3
            result=("infant");
        }else if(age<=5){ // becomes false when age >= 6
            result=("Toodler");
        }else if(age<=9){ // become false when age >= 10
            result=("Kid");
        }else if(age<=12){ // become false when age >= 13
            result=("Pre=Teen");
        }else if(age<=17){ // become false when age >= 18
            result=("Teenager");
        }else if(age<=20){ // become false when age >= 21
            result=("Young Adult");
        }else if(age<=39){ // become false when age >= 40
            result=("Adult");
        }else if(age<=49){ // become false when age >= 50
            result=("Young Middle=Aged Adult");
        }else if(age<=54){ // become false when age >= 55
            result=("Middle-Aged Adult");
        }else if(age<=64){ // become false when age >= 65
            result=("Very Young Senior Citizen");
        }else if(age<=74){ // become false when age >= 75
            result=("Young Senior Citizen");
        }else if(age<=84){ // become false when age >= 85+
            result=("Senior Citizen");
        }else
            result=("Old Senior Citizen");

        System.out.println(result);
    }
}
