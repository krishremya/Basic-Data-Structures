/*This is to basically implement the pushing and popping operation in a stack.*/

import java.util.*;
public class Stack {
    static int maximum = 1000;
    int top;

    //Initializing an array with the maximum size.
    int[] A = new int[maximum];

    //To check whether the stack is empty or not. If its empy then will return false.
    boolean isStackEmpty() {
        if(top<0)
          return false;
        else
          return true;
    }

    //Constructor to initialize the top to -1
    Stack(){
      top = -1;
    }

    //This is a function to insert element to the stack.
    public void push(int x) {

      //Checking if the maximum number of elements have inserted
        if(top >= maximum-1)
            System.out.println("Stack Overflow! ");
        else

            //Or else the top is incremented by 1
            A[++top] = x;
    }

    //This function is basically to delete element or pop element
    public int pop() {
        int x;
        if(top<0){
            System.out.println("Stack Underflow! ");
            return 0;
        }
        else
            x = A[top--];
            return  x;
    }

    //Main function to call all other functions.
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop() + " popped from the stack");
    }
}
