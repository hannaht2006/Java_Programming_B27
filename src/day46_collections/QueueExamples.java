package day46_collections;

import java.util.*;

public class QueueExamples {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(10);
        queue.add(8);
        queue.add(2);
        System.out.println(queue);//-> [2, 3, 8, 10] : random in sorted order

        System.out.println(queue.peek());//peek() method to see element at the top -> 2
        System.out.println(queue.poll());//poll() method for removing element-> 2

        System.out.println(queue);//-> [3, 10, 8]

        System.out.println(queue.peek()); // -> 3
        System.out.println(queue.poll());//remove-> 3

        System.out.println(queue);//-> [8, 10]

        //queue (is an interface inheriting the Collection interface) about check what element at the top of the list; FIFO

        System.out.println("-----------------------------");
        ArrayDeque<String> queue2 = new ArrayDeque<>();
        queue2.offer("Java"); //offer() just add element to the queue
        queue2.offer("Tuesday");
        queue2.offer("softskill");
        queue2.offer("Automation");

        System.out.println(queue2);//-> [Java, Tuesday, softskill, Automation]
        System.out.println(queue2.peek());// the other method to use is element()

        System.out.println(queue2.poll());// the other method to use is remove()
        System.out.println(queue2); //->[Tuesday, softskill, Automation]

        System.out.println(queue2.peek());//-> Tuesday

        queue2.offerFirst("API"); //method from Deque
        System.out.println(queue2);//-> [API, Tuesday, softskill, Automation]

     //   queue2.add(null);// null is not allow in queue types
     //   queue2.offer(null);
        queue2.pollLast();// remove the last element
        System.out.println(queue2);//-> [API, Tuesday, softskill]

        new ArrayDeque<>().poll();//return null, but no exception
       // new ArrayDeque<>().remove();//cause exception

        List<Integer> list = new LinkedList<>();
        ((LinkedList)list).addFirst(4);//casting down to add element
        System.out.println(list);//-> [4]

        ((Deque) list).addFirst(7);//casting down to add element to first
        System.out.println(list);//-> [7, 4]


    }
}
