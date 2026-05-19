package com.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class GraphBFSTraversalUsingAdjacencyList {

	GraphBFSTraversalUsingAdjacencyList(int nodes) {
		DataStorage.graph = new ArrayList<>();
		DataStorage.visited = new boolean[nodes];

	    for (int i = 0; i < nodes; i++) {
	    	DataStorage.graph.add(i, new ArrayList<>());
	    }
	  }

	  public static void addEdge(int a, int b) {
		  DataStorage.graph.get(a).add(b);
		  DataStorage.graph.get(b).add(a);
	  }

	  public static void bfs(int startIndex) {
	    Queue<Integer> queue = new LinkedList<>();

	    queue.add(startIndex);
	    DataStorage.visited[startIndex] = true;

	    while (!queue.isEmpty()) {
	      Integer node = queue.poll();
	      System.out.print(node + " ");

	      List<Integer> childList = DataStorage.graph.get(node);
	      
	      for (Integer child : childList) {
	        if (!DataStorage.visited[child]) {
	          queue.add(child);
	          DataStorage.visited[child] = true;
	        }
	      }
	    }
	  }
}

public class BFSTraversalUsingAdjacencyList {
	public static void main(String[] args) {
		int nodes = 7;
		new GraphBFSTraversalUsingAdjacencyList(nodes);
		GraphBFSTraversalUsingAdjacencyList.addEdge(0, 1);
		GraphBFSTraversalUsingAdjacencyList.addEdge(1, 2);
		GraphBFSTraversalUsingAdjacencyList.addEdge(0, 3);
		GraphBFSTraversalUsingAdjacencyList.addEdge(3, 4);
		GraphBFSTraversalUsingAdjacencyList.addEdge(4, 5);
		GraphBFSTraversalUsingAdjacencyList.addEdge(1, 3);

	    System.out.println("BFS Visits: ");
	    GraphBFSTraversalUsingAdjacencyList.bfs(0);
	    System.out.println();
//		new Notes().mst();
	}

}
