/*This is to implement doubly linked list */

import java.util.*;

//This is to initialize the node elements after declaring them
class Node {
     int data;
     Node next;
     Node prev;

     public Node() {
        this.data = 0;
        this.next = null;
        this.prev = null;
     }

     public Node(int d) {
       this.data = d;
     }
}

//This class is to insert element and to delete from the position that user want.
class DoublyLinked {
    Node head;

    public DoublyLinked() {
      this.head = null;
    }

    public void add(int data) {
        Node newnode = new Node(data);

        if(head == null) {
            head = newnode;
        } else {
            Node temp;
            for(temp = this.head; temp.next != null; temp = temp.next);
            temp.next = newnode;
            temp.prev = temp;
        }
    }

    //Print fucntion to print the elements added or deleted so far
    public void print() {
      Node temp;
      for(temp = this.head; temp != null; temp = temp.next) {
          System.out.println(temp.data);
      }
    }

    //DeleteNode is to delete the node as per the user's wish. The user can pass the position where the element needed to inserted.
    public void deleteNode(int pos) {
        if(head == null) {
            return;
        }
        Node temp = head;
        if(pos == 0) {
            head = temp.next;
        }
        for(int i = 0; temp != null && i < pos-1-i; i++) {
    		      temp = temp.next;
        }
        if(temp == null || temp.next == null)
    			return ;

        Node next = temp.next.next;
        temp.next = next ;
        Node prev = temp.prev.prev;
        temp.prev = prev;

    }
}

//This is to call the above declared fundtions and thereby to add and delete element
class DoublyLinkedList {
  public static void main(String[] args) {
        DoublyLinked Dll = new DoublyLinked();
        Dll.add(1);
        Dll.add(2);
        Dll.add(3);
        Dll.add(4);
        System.out.println("The elements in the linked list are:");
        Dll.print();
        Scanner Sc = new Scanner(System.in);
        int pos;
        System.out.println("Enter the position from where the element is to be deleted:");
        pos = Sc.nextInt();
        Dll.deleteNode(pos);
        System.out.println("The elements in the linked list after deletion are:");
        Dll.print();

    }

}
