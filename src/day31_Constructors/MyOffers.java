package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA", "Amazon Inc", "SDET", 100000, true,true, true,true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Sony","Dev", 120000, true,true,false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple", "QE", 124000, true, false,false,true);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "Apple", "JunDev", 80000, true, false,true,false);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Apple", "JunDev", 90000, true, true,false,false);

        Offer[]myOffers = {offer1,offer2,offer3,offer4,offer5};

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> !p.isFullTime);

        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffer = new ArrayList<>(Arrays.asList(myOffers));
        localOffer.removeIf(p-> !p.location.equals("VA"));
        System.out.println(localOffer.size() +" "+  localOffer);

        for (Offer offer : localOffer) {
            System.out.println(offer.companyName+ ":" + offer.salary);
        }




    }
}
