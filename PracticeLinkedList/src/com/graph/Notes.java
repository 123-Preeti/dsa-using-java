package com.graph;

import java.util.*;

public class Notes {

//	Minimum Spanning Tree (MST) in Graph

	public static void mst() {
		DataStorage.vertexList[0].wasVisited = true;
		DataStorage.s.push(0);
		while (!DataStorage.s.isEmpty()) {
			int current = DataStorage.s.peek();
			int v = Graph.getAdjUnvisitedVertex(current);

			if (v == -1) {
				DataStorage.s.pop();
			} else {
				DataStorage.vertexList[v].wasVisited = true;
				Graph.displayVertex(current);
				Graph.displayVertex(v);
				System.out.print(" ");
				DataStorage.s.push(v);
			}
		}
	}

//	Check if Undirected Graph is Connected

	public static boolean ifGraphConnected() {
		int startIndex = 0;
		GraphDFSTraversalUsingAdjacencyList.dfs(startIndex);

		for (int i = 0; i < DataStorage.visited.length; i++) {
			if (!DataStorage.visited[i]) {
				return false;
			}
		}

		return true;
	}

//	Get Connected Components in Undirected Graph
	public static int numberOfConnectedComponent() {
		int numberOfConnectedComponent = 0;

		for (int i = 0; i < DataStorage.nodes; i++) {
			if (!DataStorage.visited[i]) {
				GraphDFSTraversalUsingAdjacencyList.dfs(i);
				numberOfConnectedComponent++;
			}
		}

		return numberOfConnectedComponent;
	}

//	Find if Source to Destination is reachable in Undirected Graph
	public boolean ifSourceConnectedToDestination(int source, int destination) {
		GraphDFSTraversalUsingAdjacencyList.dfs(source);
		return DataStorage.visited[destination];
	}

//	Check if Source to Destination Path exists in Directed Graph

	public boolean ifSourceConnectedToDestinationDirectedGrap(int source, int destination) {

		DirectedGraph.dfs(source);

		return DataStorage.visited[destination];
	}

//	Check if Undirected Graph has Cycle
	public boolean ifUndirectedGraphHasCycle() {

		for (int i = 0; i < DataStorage.nodes; i++) {
			if (!DataStorage.visited[i]) {
				if (ifCycle(i, -1)) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean ifCycle(int index, int parent) {

		DataStorage.visited[index] = true;

		List<Integer> neighbourList = DataStorage.graph.get(index);

		for (Integer neighbour : neighbourList) {
			if (!DataStorage.visited[neighbour])
				ifCycle(neighbour, index);
			else if (neighbour != parent)
				return true;
		}

		return false;
	}

//			Check if Directed Graph has Cycle (Using DFS)

	boolean recursiveStack[] = new boolean[20];

	public boolean ifDirectedGraphHasCycle() {
		for (int i = 0; i < DataStorage.nodes; i++)
			if (ifCycleExists(i))
				return true;
		return false;
	}

	public boolean ifCycleExists(int index) {
		if (recursiveStack[index])
			return true;

		if (DataStorage.visited[index])
			return false;

		DataStorage.visited[index] = true;
		recursiveStack[index] = true;

		List<Integer> neighboursList = DataStorage.graph.get(index);

		for (Integer neighbour : neighboursList)
			if (ifCycleExists(neighbour))
				return true;

		recursiveStack[index] = false;
		return false;
	}
}