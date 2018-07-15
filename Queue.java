/*The program is to implement queue. TO input the elements to the front of the queue and to delete it.*/

import java.util.*;

public class Queue {
      int front, rear, size ;
      static int maximum = 1000;
      int [] A = new int[maximum];

      //constructor to initialize the value of the front and the rear end of the queue
      Queue() {
          front = 0;
          rear = maximum-1;

      }

     //Function to find if the queue is full
     public boolean isFull(Queue q) {
       return (q.size == maximum);

     }

     //Function to find if the queue is empty
     public boolean isEmpty(Queue q) {
        return (q.size==0);

     }

     //Function to insert the elements
     public void enQueue(int data) {

        //Checking if the queue is full
         if(isFull(this))
            return ;

         //Adding elements to the rear part there by increasing the size of the queue
         this.rear = (this.rear + 1)%maximum;
         this.A[this.rear] = data;
         this.size = this.size+1;
         System.out.println(data);

     }

     //Deleting the elements from front of the queue
     public int deQueue() {
       if(isEmpty(this))
          System.out.println("Queue Underflow! ");
       int data = this.A[this.front];
       this.front = (this.front + 1)%maximum;
       this.size = this.size - 1 ;
       return data;
     }
     public static void main(String[] args) {
         Queue Q = new Queue();
         Q.enQueue(1);
         Q.enQueue(2);
         Q.enQueue(3);
         System.out.println(Q.deQueue()+ " is dequeued from the queue.");
    }
}
