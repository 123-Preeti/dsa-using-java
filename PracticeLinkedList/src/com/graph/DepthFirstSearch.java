package com.graph;

import java.util.Stack;

class Vertex {
	public char label;
	public boolean wasVisited;

	public Vertex(char lab) {
		label = lab;
		wasVisited = false;
	}
}

class Graph {

	public Graph() {
		DataStorage.vertexList = new Vertex[DataStorage.MAX_VERTS];
		DataStorage.adjMat = new int[DataStorage.MAX_VERTS][DataStorage.MAX_VERTS];
		DataStorage.nVerts = 0;
		DataStorage.s = new Stack<Integer>();
	}

	public static void addVertex(char lab) {
		DataStorage.vertexList[DataStorage.nVerts++] = new Vertex(lab);
	}

	public static void addEdge(int start, int end) {
		DataStorage.adjMat[start][end] = 1;
		DataStorage.adjMat[end][start] = 1;
	}

	public static void displayVertex(int v) {
		System.out.print(DataStorage.vertexList[v].label + " ");
	}

	public static int getAdjUnvisitedVertex(int v) {
		for (int j = 0; j < DataStorage.nVerts; j++) {
			if (DataStorage.adjMat[v][j] == 1 && DataStorage.vertexList[j].wasVisited == false) {
				return j;
			}
		}
		return -1;
	}

	public static void dfs() {
		DataStorage.vertexList[0].wasVisited = true;
		displayVertex(0);
		DataStorage.s.push(0);

		while (!DataStorage.s.isEmpty()) {
			int v = getAdjUnvisitedVertex(DataStorage.s.peek());

			if (v == -1) {
				DataStorage.s.pop();
			} else {
				DataStorage.vertexList[v].wasVisited = true;
				displayVertex(v);
				DataStorage.s.push(v);
			}
		}
	}
}

public class DepthFirstSearch {

	public static void main(String[] args) {

		new Graph();
		Graph.addVertex('A');
		Graph.addVertex('B');
		Graph.addVertex('C');
		Graph.addVertex('D');
		Graph.addVertex('E');
		Graph.addVertex('F');

		Graph.addEdge(0, 1);
		Graph.addEdge(1, 2);
		Graph.addEdge(0, 3);
		Graph.addEdge(3, 4);
		Graph.addEdge(4, 5);
		Graph.addEdge(1, 3);

		System.out.println("Visits: ");
		Graph.dfs();
		System.out.println();
		Notes.mst();
	}

}
