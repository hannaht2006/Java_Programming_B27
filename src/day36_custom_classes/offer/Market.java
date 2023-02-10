package day36_custom_classes.offer;

import java.util.ArrayList;

public class Market {
    /*
    Create a separate class to create and test the Offer objects

    create multiple Offer objects and store them into an ArrayList of Offers. Create multiple other Lists to filter out different information:

        write a program that can only keep the offers from local area

        write a program that can remove all offers that are not for SDET or QA

        write a program that can remove the offers that are not full Time

        write a program that removes all offer that are less than 100,000 salary

        - Find the biggest and lowest salary Offers and print the whole object
     */
    public static void main(String[] args) {
        ArrayList<Offer> allOffer = new ArrayList<>();
        allOffer.add(new Offer("Amazon", "San Diego", 120_000, true, 15));
        allOffer.add(new Offer("Chase", "Chicago", 125_000, true, 15));
        allOffer.add(new Offer("Google", "Seatle", 170_000, false, 0));
        allOffer.add(new Offer("Accenture", "Chicago", 110_000, true, 5));
        allOffer.add(new Offer("Walmart", "Chicago", 125_000, false, 0));
        allOffer.add(new Offer("Meta", "Seatle", 135_000, true, 12));
        allOffer.add(new Offer("Deloitte", "Seatle", 120_000, true, 12));

        //write a program that can only keep the offers from local area
        ArrayList<Offer> localOffer = new ArrayList<>(allOffer);
        localOffer.removeIf(offer -> !offer.location.equals("Chicago"));
        System.out.println(localOffer);

        //ALternative, manually:

//        for (Offer each:allOffer){
//            if(each.location.equals("Chicago")){
//                System.out.println(each);
//            }
//        }

        // write a program that can remove the offers that are not full time

        System.out.println("--------------------");

        ArrayList<Offer> onlyFullTime = new ArrayList<>(allOffer);
        onlyFullTime.removeIf(p -> !p.isFullTime);
        System.out.println(onlyFullTime);

       // onlyFullTime.forEach(each -> System.out.println(each));

        //remove offer less that 120_000

        ArrayList <Offer> minSalary = new ArrayList<>(allOffer);
        minSalary.removeIf(p -> p.salary <130_000);
        System.out.println(minSalary);

        //Find the biggest and lowest salary Offers and print the whole object
        double min = allOffer.get(0).salary;
        double max = allOffer.get(0).salary;
        Offer maxOffer = allOffer.get(0);
        Offer minOffer = allOffer.get(0);

        for (Offer each:allOffer){
            if (each.salary>max){
                max = each.salary;
                maxOffer = each;
            }
            if (each.salary<min){
                min = each.salary;
                minOffer = each;
            }
        }
        System.out.println("Min Salary: "+ min);
        System.out.println(minOffer);
        System.out.println("Max Salary: "+ max);
        System.out.println(maxOffer);
    }
}
