package com.heap;

import java.util.*;

public class Heap {
	public static void minHeap(int[] arr) {
		PriorityQueue<Integer> heap = new PriorityQueue<>();

		for (int i = 0; i < arr.length; i++) {
			heap.add(arr[i]);
			System.out.print(heap.peek() + " ");
		}

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			heap.poll();
			System.out.print(heap.peek() + " ");
		}
		System.out.println();
	}

	public static void maxHeap(int[] arr) {
		PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			heap.add(arr[i]);
			System.out.print(heap.peek() + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			heap.poll();
			System.out.print(heap.peek() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 10, 7, 11, 5, 2, 13, 1, 45 };
		Heap.minHeap(arr);
		Heap.maxHeap(arr);
	}
}