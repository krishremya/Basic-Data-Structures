/* This program in java is to implement linked list. Linked list is a data structure where eac element is considered as an object. Its just like an array of elements but the memory allocated is not continuous. One head should be there which should link to another node. */


/*Creating a class node with 2 datas and a consructor. The data members are the node next and the data that should be added. The constructor is to initialize the data and the node value. */
class node{
	node next;
	int data;
	public node(int data){
        this.data=data;	
	this.next=null;
		
	}
}

/*Another pubic class which has a node head as data member, one constructor to intialize the value, 2 functions to add the elements to the end of the list and to print the added datas and a main function. */
public class linkedList{
	node head;
	public linkedList(){
		this.head=null;
	}
	public void add(int data){
		node newhead=new node(data);
		if(this.head==null)
		head=newhead;
		else{
		node temp;
		for(temp=this.head;temp.next!=null;temp=temp.next);
		temp.next=newhead;
		}
	}
	public void print(){
		for(node newtemp=this.head;newtemp!=null;newtemp=newtemp.next){
		System.out.println(newtemp.data);
		}
	}
	public static void main(String[] args){
	linkedList list = new linkedList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.print();
	}
}


