package day51_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice2 {
    public static void main(String[] args) {
        int[] num = {3, 4, 1, 5, 15, 4};

        System.out.println(Arrays.stream(num).boxed().distinct().collect(Collectors.toList()));

        //list to array
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 4, 1, 5, 15, 4, 2, 8, 5));

        int[] num2= list1.stream().limit(3).mapToInt(n->n).toArray();
        System.out.println(Arrays.toString(num2));
        int[] num3= list1.stream().skip(3).mapToInt(n->n*2).toArray();
        System.out.println(Arrays.toString(num3));

        System.out.println("------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 1, 5, 15, 4, 2, 8, 5));
        System.out.println(list2.stream().map(p ->
        {
            if (p > 4) {
                p = p * 2;
            } else {
                p = p;
            }
return p;
        }).collect(Collectors.toList()));

        List<Integer> list5 = new ArrayList<>(Arrays.asList(3, 4, 1, 5, 15, 4, 2, 8, 5));
        List<Integer> even = list5.stream().filter(p -> p%2 == 0).collect(Collectors.toList());
        List<Integer> odd = list5.stream().filter( p -> p%2 ==1).collect(Collectors.toList());
        //count even number
        System.out.println(list5.stream().filter(p ->p%2==0).count());
        //count unique even number
        System.out.println(list5.stream().filter(p ->p%2==0).distinct().count());


    }
}
