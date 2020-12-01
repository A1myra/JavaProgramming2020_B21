package day35_CustomClass;

import java.time.LocalDate;

public class Dog {

    public String nickName;
    public String breed;
    public String size;
    public char gender;
    public String color;
    public LocalDate DofB;

    public void setInfo(String dogNickname, String dogBreed,String dogSize,
                        char dogGender,String dogColor,LocalDate dogDateOfBirth){
        nickName=dogNickname;
        breed=dogBreed;
        size=dogSize;
        gender=dogGender;
        color=dogColor;
        DofB=dogDateOfBirth;

    }

    public void getInfo(){
        System.out.println(nickName+" "+breed+" "+size+" "+gender+" "+color+" "+DofB);
    }




}
