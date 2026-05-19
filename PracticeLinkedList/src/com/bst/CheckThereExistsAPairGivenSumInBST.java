package com.bst;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Check {
	public boolean ifPairExists(Node node, int sum) {
	    HashSet<Integer> set = new HashSet<>();
	    
	    return ifPairExistsUtil(node, sum, set); 
	  }
	  
	  public boolean ifPairExistsUtil(Node node, int sum, HashSet<Integer> set) {
	    if(node == null) {
	      return false;
	    }
	    
	    if(set.contains(sum - node.data)) {
	      return true;
	    }
	    
	    set.add(node.data);
	    
	    if(ifPairExistsUtil(node.left, sum, set)) {
	      return true;
	    }
	    
	    return ifPairExistsUtil(node.right, sum, set); 
	  }
	  
	  public boolean checkIfPairExists(Node node, int sum) {
	    List<Integer> list = new ArrayList<>();
	    
	    inorder(node, list);
	    return checkIfPairExistsUtil(sum, list);
	  }
	  
	  public void inorder(Node node, List<Integer> list) {
	    if(node == null) {
	      return;
	    }
	    
	    inorder(node.left, list);
	    
	    list.add(node.data);
	    
	    inorder(node.right, list);
	  }
	  
	  private boolean checkIfPairExistsUtil(int sum, List<Integer> list) {
	    int start = 0;
	    int end = list.size() - 1;
	    
	    
	    while(start < end) {
	      int currentSum = list.get(start) + list.get(end);
	      
	      if(currentSum == sum) {
	        return true;
	      } else if(currentSum < sum) {
	        start++;
	      } else {
	        end--;
	      }
	    }
	    
	    return false;
	  }
	  
}
public class CheckThereExistsAPairGivenSumInBST {
	public static void main(String[] args) {
	    BST a = new BST();
	    
	    Node root = null;
	    
	    root = a.insert(root, 8);
	    root = a.insert(root, 15);
	    root = a.insert(root, 6);
	    root = a.insert(root, 2);
	    root = a.insert(root, 7);
	    
	    
	    System.out.println(new Check().ifPairExists(root, 21));
	    
	    System.out.println(new Check().checkIfPairExists(root, 21));
	  }
}
