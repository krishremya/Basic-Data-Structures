/*This is to implement doubly linked list */

import java.util.*;

//This is to initialize the node elements after declaring them
class Node {
     public int data;
     Node next;
     Node prev;

     //Constructor to initialize
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

    //Constructor to initialize head as null
    public DoublyLinked() {
      this.head = null;
    }


    public void add(int data) {

        //for adding element to the end of the list
        Node newnode = new Node(data);

        //Checking if head is null, if condition satisfies then the head is equal to the added data
        if(head == null) {
            head = newnode;
        }

        //Else find the last position and then insert the element. Here next is the link to next element and prev is the link to previous element
        else {
            Node temp;
            for(temp = this.head; temp.next != null; temp = temp.next);
            temp.next = newnode;
            temp.prev = temp;
        }
    }

    //Print fucntion to print the elements added or deleted so far
    public void print() {
      Node temp;
      for(temp = this.head;temp != null;temp = temp.next) {
          System.out.println(temp.data);
      }
    }

    //DeleteNode is to delete the node as per the user's wish. The user can pass the position where the element needed to inserted.
    public void deleteNode(int pos) {

      //Checking if the head is null.  If its so the no need of deleting anything
        if(head == null) {
            return;
        }
        Node temp = head;

        //Checking if the first position is to be deleted
        if(pos == 0) {
            head = temp.next;
        }

        //Checking for the position to be deleted
        for(int i = 0;temp != null && i < pos-1-i;i++) {
    		      temp = temp.next;
        }
        if(temp == null || temp.next == null)
    			return ;

        //Poiniting the next node the next of next node
        Node next = temp.next.next;
        temp.next = next ;

        //Pointing the previous node to the previous of previous node
        Node prev = temp.prev.prev;
        temp.prev = prev;

    }
}

//This is to call the above declared fundtions and thereby to add and delete element
class DoublyLinkedList {
  public static void main(String[] args) {
        DoublyLinked Dll = new DoublyLinked();

        //Adding elements to the linked list
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

        //Deleting element from the position provided by user
        Dll.deleteNode(pos);
        System.out.println("The elements in the linked list after deletion are:");
        Dll.print();

    }

}
