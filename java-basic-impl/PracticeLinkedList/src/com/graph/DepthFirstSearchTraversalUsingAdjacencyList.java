package com.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class GraphDFSTraversalUsingAdjacencyList {

	GraphDFSTraversalUsingAdjacencyList(int nodes) {
		DataStorage.graph = new ArrayList<>();
		DataStorage.visited = new boolean[nodes];

		for (int i = 0; i < nodes; i++)
			DataStorage.graph.add(i, new ArrayList<>());
	}

	public static void addEdge(int a, int b) {
		DataStorage.graph.get(a).add(b);
		DataStorage.graph.get(b).add(a);
	}

	public static void dfs(int start) {
		Stack<Integer> stack = new Stack<>();

		stack.push(start);
		DataStorage.visited[start] = true;

		while (!stack.isEmpty()) {
			Integer node = stack.pop();
			System.out.print(node + " ");

			List<Integer> neighboursList = DataStorage.graph.get(node);

			for (Integer neighbour : neighboursList) {
				if (!DataStorage.visited[neighbour]) {
					stack.push(neighbour);
					DataStorage.visited[neighbour] = true;
				}
			}
		}
		System.out.println();
	}
}

public class DepthFirstSearchTraversalUsingAdjacencyList {

	public static void main(String[] args) {
		DataStorage.nodes = 7;

		new GraphDFSTraversalUsingAdjacencyList(DataStorage.nodes);

		GraphDFSTraversalUsingAdjacencyList.addEdge(0, 1);
		GraphDFSTraversalUsingAdjacencyList.addEdge(0, 2);
		GraphDFSTraversalUsingAdjacencyList.addEdge(1, 3);
		GraphDFSTraversalUsingAdjacencyList.addEdge(2, 4);
		GraphDFSTraversalUsingAdjacencyList.addEdge(3, 5);
		GraphDFSTraversalUsingAdjacencyList.addEdge(4, 5);
		GraphDFSTraversalUsingAdjacencyList.addEdge(4, 6);
//    GraphDFSTraversalUsingAdjacencyList.dfs(0);

//    System.out.println(Notes.ifGraphConnected());
		System.out.println(Notes.numberOfConnectedComponent());
	}

}
