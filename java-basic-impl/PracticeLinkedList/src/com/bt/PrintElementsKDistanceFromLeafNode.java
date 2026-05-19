package com.bt;

public class PrintElementsKDistanceFromLeafNode {
	public void printAllElementsAtKDistanceFromLeafNode(Node node, int k) {
		if (node == null || k < 0) {
			return;
		}

		int arr[] = new int[20];
		boolean visited[] = new boolean[20];

		printAllElementsAtKDistanceFromLeafNodeUtil(node, k, arr, visited, 0);
	}

	public void printAllElementsAtKDistanceFromLeafNodeUtil(Node node, int k, int[] arr, boolean[] visited, int count) {
		if (node == null) {
			return;
		}

		arr[count] = node.data;
		visited[count] = false;

		if (node.left == null && node.right == null && count - k >= 0 && visited[count - k] == false) {
			System.out.print(arr[count - k] + " ");
			visited[count - k] = true;
			return;
		}

		printAllElementsAtKDistanceFromLeafNodeUtil(node.left, k, arr, visited, count + 1);
		printAllElementsAtKDistanceFromLeafNodeUtil(node.right, k, arr, visited, count + 1);
	}

}

/*

		HashSet<Node> s = new HashSet<>();
		int printKDistantfromLeaf(Node root, int k)
		{
		    ArrayList<Node> list = new ArrayList<>();
		    s.clear();
		    findNode(root,k,list);
		    
		    return s.size();
		    // Write your code here
		}
		
		void findNode(Node root,int k,ArrayList <Node> list)
		{
		    if(root==null)
		    return;
		    
		    list.add(root);
		    
		    if(root.left==null && root.right==null && list.size()>k)
		    {
		        s.add(list.get(list.size()-k-1));
		    }
		    findNode(root.left,k,list);
		    findNode(root.right,k,list);
		    
		    list.remove(root);
		}
		
*/
