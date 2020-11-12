package day12_NestedIf;

public class AgeGroup {

    public static void main(String[] args) {

        int age = 5;
        String result=" ";

        if(age>=1 && age<=2){ // it becomes false when age >= 3
            result=("infant");
        }else if(age>=3 && age<=5){ // age <= 5, becomes false when age >= 6
            result=("Toodler");
        }else if(age>=6 && age<=9){ // age <= 9, become false when age >= 10
            result=("Kid");
        }else if(age>=10 && age<=12){ // age <= 12, become false when age >= 13
            result=("Pre=Teen");
        }else if(age>=13 && age<=17){ // age <= 17, become false when age >= 18
            result=("Teenager");
        }else if(age>=18 && age<=20){ // age <= 20, become false when age >= 21
            result=("Young Adult");
        }else if(age>=21 && age<=39){ // age <= 39, become false when age >= 40
            result=("Adult");
        }else if(age>=40 && age<=49){ // age <= 49, become false when age >= 50
            result=("Young Middle=Aged Adult");
        }else if(age>=50 && age<=54){ // age <= 54, become false when age >= 55
            result=("Middle-Aged Adult");
        }else if(age>=55 && age<=64){ // age <= 64, become false when age >= 65
            result=("Very Young Senior Citizen");
        }else if(age>=65 && age<=74){ // age <= 74, become false when age >= 75
            result=("Young Senior Citizen");
        }else if(age>=75 && age<=84){ // age <= 84, become false when age >= 85+
            result=("Senior Citizen");
        }else
            result=("Old Senior Citizen");

        System.out.println(result);
    }
}
/*2. write a program that can define the age groups of a person
        age groups are:
        infant (< 1 year)
        Toddler (3 - 5),
        Kid (6 - 9),
        Pre-Teen (10 - 12),
        Teenager (13 - 17),
        Young Adult (18 - 20),
        Adult (21 - 39),
        Young Middle-Aged Adult (40 - 49),
        Middle-Aged Adult (50 - 54),
        Very Young Senior Citizen (55 - 64),
        Young Senior Citizen (65 - 74),
        Senior Citizen (75 - 84),
        Old Senior Citizen (85+)

 */