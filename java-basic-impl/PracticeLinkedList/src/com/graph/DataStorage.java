package com.graph;

import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DataStorage {
	
	  public static final int MAX_VERTS = 20;
	  public static  Vertex vertexList[] = null;
	  public static int adjMat[][] = null;
	  public static int nVerts = 0;
	  public static Queue<Integer> q = null;
	  public static Stack<Integer> s = null;
	  public static List<List<Integer>> graph;
	  public static boolean visited[];
	  public static int nodes;
}
