package com.bst;

public class SiblingNode {
	 public static  Node getSiblingNode(Node node, int val) {
		    if(node == null || node.data == val) {
		      return null;
		    }
		    
		    Node parentNode = null;
		    
		    while(node != null) {
		      if(val < node.data) {
		        parentNode = node;
		        node = node.left;
		      } else if(val > node.data) {
		        parentNode = node;
		        node = node.right;
		      } else {
		        break;
		      }
		    }
		    
		    if(parentNode.left != null && val == parentNode.left.data) {
		      return parentNode.right;
		    }
		    
		    if(parentNode.right != null && val == parentNode.right.data) {
		      return parentNode.left;
		    }
		    
		    return null;
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
			    
			    Node siblingNode = getSiblingNode(root, 3);
			    if(siblingNode != null) {
			      System.out.println("Sibling: " + siblingNode.data);
			    } else {
			      System.out.println("No Sibling");
			    }
			  }
}
