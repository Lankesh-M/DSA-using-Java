package Heap;
import java.util.*;
public class priorityQueue {
 public static void main(String[] args) {
    PriorityQueue<Integer> q = new PriorityQueue<>();

    q.add(3);
    q.add(4);
    q.add(6);
    q.add(2);

    Iterator itr = q.iterator();
    while (itr.hasNext()) {
        System.out.println(itr.next());
    }
 }   
}
