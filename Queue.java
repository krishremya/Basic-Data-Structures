import java.util.*;

public class Queue {
      int front, rear, size ;
      static int maximum = 1000;
      int [] A = new int[maximum];
      Queue() {
          front = 0;
          rear = maximum-1;

      }

     public boolean isFull(Queue q) {
       return (q.size == maximum);

     }

     public boolean isEmpty(Queue q) {
        return (q.size==0);

     }

     public void enQueue(int data) {

         if(isFull(this))
            return ;
         this.rear = (this.rear + 1)%maximum;
         this.A[this.rear] = data;
         this.size = this.size+1;
         System.out.println(data);

     }

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
