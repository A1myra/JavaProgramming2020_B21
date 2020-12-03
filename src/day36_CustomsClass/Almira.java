package day36_CustomsClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Almira { // almira has an offer

    public static void main(String[] args) {

        ArrayList<Offer> offers = new ArrayList<>();
        offers.addAll(Arrays.asList(new Offer(), new Offer(), new Offer(), new Offer(), new Offer()));

        offers.get(0).setInfo("CA","SDET","Capital One",120000,true,true,false,false);
        offers.get(1).setInfo("VA","QA","Apple",115000,true,true,true,true);
        offers.get(2).setInfo("DC","PO","PNC",100000,true,true,false,true);
        offers.get(3).setInfo("NY","SDET","Samsung",140000,true,true,true,true);
        offers.get(4).setInfo("TX","SDET","BOA",100000,true,true,false,true);
        for(int i=0; i<=offers.size()-1; i++){
            offers.get(i).getInfo();
        }

        System.out.println("============================================================");
        //only print the offers from VA

        for(Offer each: offers) {
            if(each.location.equals("VA") && each.salary >= 120000){
                each.getInfo();
            }
        }

    }
}
