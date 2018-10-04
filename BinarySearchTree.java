import java.util.*;
/* This program is to implement binary search tree. Node class decalres the right child, left child and the data. 
Tree class is to perform the functions like inserting element and printing it in all the traversal method. */
class Node {
  int data;
  Node left;
  Node right;

  public Node(int data){
    this.left =  null;
    this.right = null;
    this.data = data;
  }
}

class Tree {
  Node root;
  Tree(Node root) {
    this.root = root;
  }

  void insertTree(Node node, int data) {
    if(node.data < data) {
      if(node.left != null) {
        insertTree(node.left, data);
      } else {
        Node newNode = new Node(data);
        node.left = newNode;
      }
    } else {
      if(node.right != null){
        insertTree(node.right, data);
      } else {
        Node newNode = new Node(data);
        node.right = newNode;
      }
    }
  return ;
  }

  void inOrderPrintTree(Node root) {
        if(root == null)
          return;
        inOrderPrintTree(root.right);
        System.out.println(root.data);
        inOrderPrintTree(root.left);
        return;
    }
  void preOrderPrintTree(Node root) {
        if(root == null) 
          return;
        System.out.println(root.data);
        preOrderPrintTree(root.left);
        preOrderPrintTree(root.right);
    }
    void postOrderPrintTree(Node root) {
        if(root == null) 
          return;
        preOrderPrintTree(root.left);
        preOrderPrintTree(root.right);
        System.out.println(root.data);
    }

}

  class BinarySearchTree{
    public static void main(String[] args) {
      Tree T = new Tree(new Node(1));
      T.insertTree(T.root, 2);
      T.insertTree(T.root, 3);
      T.insertTree(T.root, 4);
      T.insertTree(T.root, 5);
      System.out.println("In-Order Traversal");
      T.inOrderPrintTree(T.root);
      System.out.println("Pre-Order Traversal");
      T.preOrderPrintTree(T.root);
      System.out.println("Post-Order Traversal");
      T.postOrderPrintTree(T.root);
    }
}
