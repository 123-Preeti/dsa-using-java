package com.bst;

public class LCA {
	public static Node findLCA(Node node, int n1, int n2) {
	    if(node == null) {
	      return null;
	    }
	    
	    while(node != null) {
	      if(node.data > n1 && node.data > n2) {
	        node = node.left;
	      } else if(node.data < n1 && node.data < n2) {
	        node = node.right;
	      } else {
	        break;
	      }
	    }
	    
	    return node;
	  }
	public static void main(String[] args) {
	    BST a = new BST();
	    Node root = null;
	    
	    root = a.insert(root, 8);
	    root = a.insert(root, 15);
	    root = a.insert(root, 6);
	    root = a.insert(root, 2);
	    root = a.insert(root, 7);
	    root = a.insert(root, 13);
	    root = a.insert(root, 20);
	    
	    Node lca = findLCA(root, 2, 15);
	    
	    if(lca != null) {
	      System.out.println(lca.data);  
	    }
	    
	  }
}
