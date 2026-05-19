package com.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class DirectedGraph {

	DirectedGraph(int nodes) {
		DataStorage.graph = new ArrayList<>();
		DataStorage.visited = new boolean[nodes];
		DataStorage.nodes = nodes;

		for (int i = 0; i < nodes; i++) {
			DataStorage.graph.add(i, new ArrayList<>());
		}
	}

	public static void addEdge(int a, int b) {
		DataStorage.graph.get(a).add(b);
	}

	public static boolean ifDirectedGraphStronglyConnected() {

		for (int i = 0; i < DataStorage.nodes; i++) {
			dfs(i);

			for (int j = 0; j < DataStorage.nodes; j++) {
				if (!DataStorage.visited[j]) {
					return false;
				}
			}

			Arrays.fill(DataStorage.visited, false);
		}

		return true;
	}

	public static void dfs(int start) {
		Stack<Integer> stack = new Stack<>();

		stack.push(start);
		DataStorage.visited[start] = true;

		while (!stack.isEmpty()) {
			Integer node = stack.pop();

			List<Integer> neighboursList = DataStorage.graph.get(node);

			for (Integer neighbour : neighboursList) {
				if (!DataStorage.visited[neighbour]) {
					stack.push(neighbour);
					DataStorage.visited[neighbour] = true;
				}
			}
		}
	}

	public void dfsAnother(int start) {
		DataStorage.visited[start] = true;

		List<Integer> neighboursList = DataStorage.graph.get(start);

		for (Integer neighbour : neighboursList) {
			if (!DataStorage.visited[neighbour]) {
				dfsAnother(neighbour);
			}
		}
	}
}

public class CheckIfDirectedGraphIsStronglyConnected {

	public static void main(String[] args) {
		int nodes = 4;

		new DirectedGraph(nodes);

		DirectedGraph.addEdge(0, 1);
		DirectedGraph.addEdge(1, 2);
		DirectedGraph.addEdge(2, 0);
		DirectedGraph.addEdge(0, 3);
		DirectedGraph.addEdge(3, 2);

		System.out.println(DirectedGraph.ifDirectedGraphStronglyConnected());
	}

}