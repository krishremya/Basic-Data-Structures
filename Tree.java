import java.util.*;

class Node {
  Node left;
  Node right;
  int data;

  Node(int data) {
    this.data = data;
    this.right = this.left = null;
  }
}

class BinaryTree {
  Node root;
  BinaryTree(Node root) {
    this.root = root;
  }

  void insertTree(Node node1, int data) {
    if(node1.data < data) {
      if(node1.left != null) {
        insertTree(node1.left, data);
      } else {
        Node newNode = new Node(data);
        node1.left = newNode;
      }
    } else {
      if(node1.right !=null) {
        insertTree(node1.right, data);
      } else {
        Node newNode = new Node(data);
        node1.right= newNode;
      }
    }
    return ;
  }

  void printTree(Node root) {
    if(root == null) {
      return ;
    }
    printTree(root.right);
    System.out.println(root.data);
    printTree(root.left);
  }
}

class Tree {
  public static void main(String[] args) {
    BinaryTree BT = new BinaryTree(new Node(50));
    BT.insertTree(BT.root, 4);
    BT.insertTree(BT.root, 35);
    BT.insertTree(BT.root, 22);
    BT.insertTree(BT.root, 10);
    BT.insertTree(BT.root, 8);
    BT.insertTree(BT.root, 44);
    BT.printTree(BT.root);
  }
}
