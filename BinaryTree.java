import java.util.*;

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
  Tree() {
    this.root = null;
  }

  void insertTree(Node node, int data) {
    if(node.left == null) {
      Node newNode = new Node(data);
      if(node.data < data) {
        node.left = newNode;
      } else {
        node.right = newNode;
      }
    } else if(node.data < data) {
          insertTree(node.left, data);
    } else {
          insertTree(node.right, data);
    }
    return;
  }

  void printTree(Node root) {
        if(root == null)
          return;
        printTree(root.right);
        System.out.println(this.root.data);
        printTree(root.left);
        return;
    }
}

  class BinaryTree {
    public static void main(String[] args) {
      Tree TreeA = new Tree();
      Node root = new Node(100);
      TreeA.root = root;
      TreeA.insertTree(TreeA.root, 50);
      TreeA.insertTree(TreeA.root, 52);
      TreeA.insertTree(TreeA.root, 11);
      TreeA.insertTree(TreeA.root, 23);
      TreeA.printTree(TreeA.root);
    }
}
