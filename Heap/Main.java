package Heap;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception {
        Integer a = 10;
        Integer b= 6;
        System.out.print(a.compareTo(b));

        Heap<Integer> heap = new Heap<>();
        heap.insert(34);
        heap.insert(20);
        heap.insert(22);
        heap.insert(b);
        heap.insert(a);

        ArrayList list =  heap.heapSort();
        System.out.println(list);
    }
}
