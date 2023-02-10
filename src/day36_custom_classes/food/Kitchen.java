package day36_custom_classes.food;

import java.util.Arrays;

public class Kitchen {
    public static void main(String[] args) {
        Food [] allFood = new Food [5];
        System.out.println(Arrays.toString(allFood));
        Food apples = new Food("Apple");
        allFood[0] = apples;//storing the Food object, apples, into the Food array
        allFood[1] = new Food("Sushi", 10);
        allFood[2] = new Food("Cajun Pasta", 2, 3.99);
        allFood[3] = new Food("Kebab", 5, 2.5);
        allFood[4] = new Food("Plov", 4, 2.99);
        System.out.println(Arrays.toString(allFood));

        //print each food in separate line
        System.out.println();
// find all food that start with 'A' and or 'C' and print the array
        for(Food each: allFood){
            if (each.name.startsWith("A") || each.name.startsWith("C")){
                System.out.println(each);
            }

        }
        System.out.println("Food that is over $9");
        for (Food each:allFood){
            if (each.totalPrice > 9){
                System.out.println(each.name);
            }
        }
    }
}
