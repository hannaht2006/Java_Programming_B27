package day24_array;

import org.w3c.dom.ls.LSOutput;

public class SchoolStore {
    public static void main(String[] args) {

        // each item price and id are related in the positions they are in the array

        String[] items = {"Backpack", "Jacket", " Shirt", " Macbook", "Notebook", "Headphone"};
        double[] prices = {59.99, 150.0, 10.55, 1_000, 3.49, 15.99};
        int[] itemId = {500101, 500102, 500103, 500104, 500105, 500106};

        // print the catalog
        System.out.println("Full catalog\nID  \t|  Name  \t|   Price");
        for (int i = 0; i < items.length; i++) {
            System.out.println(itemId[i] + " | " + items[i] + "  |  " + prices[i]);
        }

        // finding if jacket in the store
        boolean inStock = false; //set default that the item is not in store
        for (String eachItem : items) { // eachItem will represent each element from the items array
            if (eachItem.equalsIgnoreCase("jacket")) {
                inStock = true;
                break;
            }
        }
        System.out.println(inStock? "Jacket is in stock": "we don't have the item in stock right now");
        System.out.println("-----------");

        // find the index of notebook
        int index = -1;// set default index of notebook is -1
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("notebook")){
              index = i;
            }
        }
        System.out.println("Index of the notebook: " + index);
        System.out.println("-------------");

        // find the most expensive item

        double maxPrice = prices[0]; // set first element is default
        int indexOfMax = 0;
        for (int i = 1; i < prices.length; i++) { // set i =1 because we set i=0 price is default so don't need to check first item price
            if (prices[i] > maxPrice){
                maxPrice = prices[i];
                indexOfMax = i;

            }
        }
        System.out.println("Most expensive item: " + itemId[indexOfMax] + " | " + items[indexOfMax] + "  |  " + prices[indexOfMax]);
    }
}
