package LinkedList;

import java.util.LinkedList;

public class DoubleLinkedList {

    private Node head;
    private Node tail;
    int size=0;
    public DoubleLinkedList(){
        this.size = size;
    }
    
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null)
            head.prev = node;
        head = node;
        size++;
    }

    public void display(){
        Node curr = head;
        // Node 
        while(curr != null){
            System.out.print(curr.value+"<-->");
            curr = curr.next;
        }
        System.out.println("end");
        return;
    }
    public void displayRev(){
        Node curr = head;
        Node last = null;
        while(curr != null){
            last = curr;
            curr = curr.next;
        }
        while(last != null){
            System.out.print(last.value + "<--->");
            last = last.prev;
        }
        System.out.print("end");
    }

    private class Node{
        private int value;
        private Node prev;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node prevNode, Node nextNode){
            this.value = value;
            this.next = nextNode;
            this.prev = prevNode;
        }
    }
}
class MainDll{
    public static void main(String[] args) {
        System.out.print("Doubly Linked List Implementation --- ");
        DoubleLinkedList dll = new DoubleLinkedList();
        LinkedList<Integer> l = new LinkedList<>();
        dll.insertFirst(10);
        dll.insertFirst(20);
        dll.insertFirst(30);
        System.out.println("Size:"+dll.size);
        dll.display();
        dll.displayRev();

    }
}