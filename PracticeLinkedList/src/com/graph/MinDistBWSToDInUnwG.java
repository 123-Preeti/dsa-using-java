package com.graph;

import java.util.*;

//  Min distance from source to destination in unweighted Graph
class GraphMin_distance {

	GraphMin_distance(int nodes) {
		DataStorage.graph = new ArrayList<>();
		DataStorage.visited = new boolean[nodes];

		for (int i = 0; i < nodes; i++) {
			DataStorage.graph.add(i, new ArrayList<>());
		}
	}

	public void addEdge(int a, int b) {
		DataStorage.graph.get(a).add(b);
		DataStorage.graph.get(b).add(a);
	}

	public int minimumDistanceBetweenTwoNodes(int source, int destination) {
		if (source == destination) {
			return 0;
		}

		Queue<Integer> queue = new LinkedList<>();
		int minDistance = 0;

		queue.add(source);
		DataStorage.visited[source] = true;

		while (!queue.isEmpty()) {
			int size = queue.size();

			while (size > 0) {
				Integer node = queue.poll();

				List<Integer> childList = DataStorage.graph.get(node);

				for (Integer child : childList) {
					if (child == destination) {
						return ++minDistance;
					}
					if (!DataStorage.visited[child]) {
						queue.add(child);
						DataStorage.visited[child] = true;
					}
				}

				size--;
			}

			minDistance++;
		}

		return -1;
	}

}

public class MinDistBWSToDInUnwG {

	public static void main(String[] args) {
		int nodes = 6;
		GraphMin_distance a = new GraphMin_distance(nodes);
		a.addEdge(0, 1);
		a.addEdge(0, 3);
		a.addEdge(1, 2);
		a.addEdge(3, 4);
		a.addEdge(2, 4);
		a.addEdge(4, 5);
		System.out.println(a.minimumDistanceBetweenTwoNodes(0, 5));
	}
}