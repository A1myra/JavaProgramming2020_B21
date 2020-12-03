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
            if(each.location.equals("VA") && each.salary >= 110000 && each.jobTitle.equals("SDET")){
                each.getInfo();
            }
        }

        System.out.println("============================================================");

        ArrayList<Offer> localOffers = new ArrayList<>(offers);
        localOffers.removeIf(p->!p.location.equals("VA")); // retain if the offer is from VA

        System.out.println("VA offers: "+localOffers.size());

        System.out.println("============================================================");

        ArrayList<Offer> sdetOffers = new ArrayList<>(offers);
        sdetOffers.removeIf(p->!p.jobTitle.equals("SDET")); // retain if the offer is for SDET

        System.out.println("SDET offers: "+sdetOffers.size());

        System.out.println("============================================================");

        ArrayList<Offer> moreThan120k = new ArrayList<>(offers);
        moreThan120k.removeIf(p->p.salary < 120000); // remove all the offers that has salary less than 120k

        System.out.println("Offers more than 120k : "+moreThan120k.size());


    }
}
