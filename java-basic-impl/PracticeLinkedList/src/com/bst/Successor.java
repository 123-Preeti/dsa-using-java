package com.bst;

//		just greatest element
public class Successor {
	public static  Node getInorderSuccessor(Node node, int val) {
	    if(node == null) {
	      return null;
	    }
	    
	    Node inorderSuccessor = null;
	    
	    while(node != null) {
	      if(val < node.data) {
	        inorderSuccessor = node;
	        node = node.left;
	      } else if (val > node.data) {
	        node = node.right;
	      } else {
	        if(node.right != null) {
	          inorderSuccessor = getSuccessor(node);
	        }
	        break;
	      }
	    }
	    return node != null ? inorderSuccessor : null;
	  }
	 public static Node getSuccessor(Node node) {
		    if(node == null) {
		      return null;
		    }
		    
		    Node temp = node.right;
		    
		    while(temp.left != null) {
		      temp = temp.left;
		    }
		    
		    return temp;
		    
		  }
	  public static void main(String[] args) {
		    BST a = new BST();
		    Node root = null;
		    
		    root = a.insert(root, 8);
		    root = a.insert(root, 3);
		    root = a.insert(root, 6);
		    root = a.insert(root, 10);
		    root = a.insert(root, 4);
		    root = a.insert(root, 7);
		    root = a.insert(root, 1);
		    root = a.insert(root, 14);
		    root = a.insert(root, 13);
		    
		    Node inorderSuccessor = getInorderSuccessor(root, 3);
		    if(inorderSuccessor != null) {
		      System.out.println("Inorder Successor: " + inorderSuccessor.data);
		    } else {
		      System.out.println("Inorder Successor doesn't exists");
		    }
		  }
}
