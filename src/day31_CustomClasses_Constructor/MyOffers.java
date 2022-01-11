package day31_CustomClasses_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setInfo("Orange County, CA", "CoStar", "SDET", 115_000, true, true, true, true);
        System.out.println(offer1);

        Offer offer2 = new Offer();
        offer2.setInfo("Santa Monica, CA", "Sony, INC", "QA Engineer", 110_000, true, true, false, true);
        System.out.println(offer2);

        Offer offer3 = new Offer();
        offer2.setInfo("Los Angeles, CA", "Walt Disney INC", "Senior SDET", 125_000, true, true, false, true);
        System.out.println(offer3);

        Offer offer4 = new Offer();
        offer2.setInfo("San Diego, CA", "Scripts INC", "QE", 120_000, false, false, false, false);
        System.out.println(offer4);

        Offer offer5 = new Offer();
        offer2.setInfo("Irvine, CA", "Google, INC", "SDET II", 105_000, true, true, false, true);
        System.out.println(offer5);

        Offer offer6 = new Offer();
        offer2.setInfo("Irvine, CA", "Cox Automotive", "SDET I", 114_000, false, false, false, false);
        System.out.println(offer6);

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5, offer6};
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);

        System.out.println(fullTimeOffers.size());

        /*ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !(p.location.contains("CA")));
        System.out.println(localOffers.size());

        for (Offer localOffer : localOffers){
            System.out.println(localOffer.companyName+ " : "+localOffer.salary);
        }*/


    }
}
/*2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that are not for SDET
            2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary*/