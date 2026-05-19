package com.graph;

import java.util.LinkedList;

class GraphBFS {

	public GraphBFS() {
		DataStorage.vertexList = new Vertex[DataStorage.MAX_VERTS];
		DataStorage.adjMat = new int[DataStorage.MAX_VERTS][DataStorage.MAX_VERTS];
		DataStorage.nVerts = 0;
		DataStorage.q = new LinkedList<Integer>();
	}

	public static void addVertex(char lab) {
		DataStorage.vertexList[DataStorage.nVerts++] = new Vertex(lab);
	}

	public static void addEdge(int start, int end) {
		DataStorage.adjMat[start][end] = 1;
		DataStorage.adjMat[end][start] = 1;
	}

	public static void displayVertex(int v) {
		System.out.print(DataStorage.vertexList[v].label);
	}

	public static int getAdjUnvisitedVertex(int v) {
		for (int j = 0; j < DataStorage.nVerts; j++) {
			if (DataStorage.adjMat[v][j] == 1 && DataStorage.vertexList[j].wasVisited == false) {
				return j;
			}
		}
		return -1;
	}

	public static void bfs() {
		DataStorage.vertexList[0].wasVisited = true;
		displayVertex(0);
		DataStorage.q.add(0);
		int v2;

		while (!DataStorage.q.isEmpty()) {
			int v1 = DataStorage.q.remove();
			while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {
				DataStorage.vertexList[v2].wasVisited = true;
				displayVertex(v2);
				DataStorage.q.add(v2);
			}
		}
	}
}

public class BreadthFirstSearch {

	public static void main(String[] args) {

		new GraphBFS();
		GraphBFS.addVertex('A');
		GraphBFS.addVertex('B');
		GraphBFS.addVertex('C');
		GraphBFS.addVertex('D');
		GraphBFS.addVertex('E');
		GraphBFS.addVertex('F');

		GraphBFS.addEdge(0, 1);
		GraphBFS.addEdge(1, 2);
		GraphBFS.addEdge(0, 3);
		GraphBFS.addEdge(3, 4);
		GraphBFS.addEdge(4, 5);
		GraphBFS.addEdge(1, 3);

		System.out.println("BFS Visits: ");
		GraphBFS.bfs();
		System.out.println();
	}

}