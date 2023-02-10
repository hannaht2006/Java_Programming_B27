package day51_stream;

import kotlin.jvm.internal.CollectionToArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3,4,5,6,7,12));
        list1.stream();

        int[] num = {1,4,6,9,13, 4};
        Arrays.stream(num);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,3,3,4,5,6,7,3));
        List<Integer> list3= list2.stream().distinct().collect(Collectors.toList());

        System.out.println(list3);

      int[] arr2 ={1,1,3,3,4,5,6,7,3};
     int[] arr3 = Arrays.stream(arr2).distinct().toArray();
        System.out.println(Arrays.toString(arr3));
//skip() removes the n number of elements
        List<String> list4 = new ArrayList<>(Arrays.asList("summer", "bike", "fall", "rainning", "pond", "lake", "fishing"));
        List <String> list5 = list4.stream().skip(3).collect(Collectors.toList());
        System.out.println(list5);

        //limit(): keep n number of elements
       List<String> list6 =  list4.stream().limit(5).collect(Collectors.toList());
        System.out.println(list6);

        //use both skip() and limit()
        List<String> list7 = list4.stream().limit(6).skip(2).collect(Collectors.toList());

        //count(): how many elements/data are in the stream
        List<Integer> list8 = new ArrayList<>(Arrays.asList(1,1,3,3,4,5,6,7,3,1,8,10,9));
         System.out.println(list8.stream().count());
        System.out.println(list8.stream().distinct().count());

        //task
        String s = "aaaaabbbccccccdddddeeeeeee";
        System.out.println(Arrays.stream(s.split("")).distinct().count());
        System.out.println(Arrays.stream(s.split("")).distinct().collect(Collectors.toList()));

    }
}
