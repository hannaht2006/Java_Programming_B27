package day32_arraylist;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(0);
        list.add(12);

        list.set(2, 10);//changes the element at index 2, to be the value of 10
        System.out.println(list);

        list.set(0,2);
        System.out.println(list);

        //
        ArrayList<String> strs = new ArrayList<>();
        strs.add("Friday");
        strs.add("off");
        strs.add("study");
        strs.add("relax");

        int indexOfRelax = strs.indexOf("relax");
        strs.set(indexOfRelax, "coding");
        System.out.println(strs);




    }
}
