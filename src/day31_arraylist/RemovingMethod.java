package day31_arraylist;

import java.util.ArrayList;

public class RemovingMethod {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
        System.out.println(words);//--> [today, raining, java, flying]

        //removing by index:
        words.remove(2); // return the element that you removed
        System.out.println(words);//removing element at index 2-->[today, raining, flying]

        System.out.println(words.remove(0));//-->today (the element that you remove)
        System.out.println(words);//--> [raining, flying]

        words.clear(); //empty the whole ArrayList (delete everything)
        System.out.println(words);//--> []

        //removing by object:
        words.add("jumping");
        words.add("barn");
        words.add("chicken");
        words.add("cow");
        System.out.println(words);


        words.remove("barn");//return boolean
        System.out.println(words);//--> [jumping, chicken, cow]
        System.out.println(words.remove("Cow"));//--> false (boolean) doesn't have "Cow"
        System.out.println("remover chicken");
        System.out.println(words.remove("chicken"));
        System.out.println(words);//--> [jumping, chicken, cow]

        System.out.println("----------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(0);
        nums.add(2);
        nums.add(4);

        nums.remove(0);
        System.out.println(nums);//-->[5, 0, 2, 4]

        Integer a = 0;
        nums.remove(a); // a is integer, so it removed by element, the element it removes 0
        System.out.println(nums);//--> [5, 2, 4]

        nums.remove((Integer)2);//casting the number 2 to an Integer type, so we can remove the element 2 t, not index 2. convert type and remove number '2'
        System.out.println(nums);//-->[5, 4]

        nums.add(0,4);
        System.out.println(nums);//--> [4, 5, 4]

        nums.remove((Integer)4);
        System.out.println(nums);//--> [5, 4] : remove the first 4

    }
}
/*
String s = "hello";
s.charAt(0)
System.out.println(s.charAt(0));
 */
