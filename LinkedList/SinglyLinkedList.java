package LinkedList;


public class SinglyLinkedList{

    private Node head;
    private Node tail;
    int size=0;
    public SinglyLinkedList(){
        this.size = size;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null)
            tail = head;
        
        size += 1;
    }

    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val + "-->");
            curr = curr.next;
        }
        System.out.print("end");
    }
   
    public void insertEnd(int val){
        if(tail == head){
            insertFirst(val);
            return;
        }
        Node node =  new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAt(int index, int val){
        size += 1;
        Node node = new Node(val);
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertEnd(val);
            return;
        }
        Node curr = head;
        int i = 1;
        while (curr != null) {
            if(i == index){
                Node temp = curr.next;
                curr.next = node;
                node.next = temp;
                return;
            }
            curr = curr.next;
            i++;
        }
        
    }
    
    //Only be accessed by this class
    private class Node {
        private int val;
        private Node next;

        public Node(int value, Node next){
            this.val = value;
            this.next = next;
        }
        public Node(int value){
            this.val = value;
        }
        
    }

}
class MainSll{
    public static void main(String[] args) {
        System.out.println("Hello world");
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertFirst(4);
        // ll.insertEnd(0); // Added to the end
        ll.insertAt(1, 123);
        ll.display();
      System.out.println("\n"+ll.size);
        
        
    }
}