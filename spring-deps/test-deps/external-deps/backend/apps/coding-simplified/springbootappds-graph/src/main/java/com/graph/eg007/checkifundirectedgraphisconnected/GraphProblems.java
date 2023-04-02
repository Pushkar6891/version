package com.graph.eg007.checkifundirectedgraphisconnected;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Graph {
	List<List<Integer>> graph;
	boolean visited[];
	int nodes;

	Graph(int nodes) {
		graph = new ArrayList<>();
		visited = new boolean[nodes];
		this.nodes = nodes;

		for (int i = 0; i < nodes; i++) {
			graph.add(i, new ArrayList<>());
		}
	}

	public void addEdge(int a, int b) {
		graph.get(a).add(b);
		graph.get(b).add(a);
	}

	public boolean ifGraphConnected() {
		int startIndex = 0;
		dfs(startIndex);

		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				return false;
			}
		}

		return true;
	}

	public void dfs(int start) {
		Stack<Integer> stack = new Stack<>();

		stack.push(start);
		visited[start] = true;

		while (!stack.isEmpty()) {

			Integer node = stack.pop();

			List<Integer> neighboursList = graph.get(node);

			for (Integer neighbour : neighboursList) {
				if (!visited[neighbour]) {
					stack.push(neighbour);
					visited[neighbour] = true;
				}
			}
		}
	}
}

public class GraphProblems {

	public static void main(String[] args) {
		int nodes = 7;

		Graph a = new Graph(nodes);

		a.addEdge(0, 1);
		a.addEdge(0, 2);
		a.addEdge(1, 3);
		a.addEdge(2, 4);
		a.addEdge(3, 5);
		a.addEdge(4, 5);

		System.out.println(a.ifGraphConnected());

		Graph b = new Graph(nodes);

		b.addEdge(0, 1);
		b.addEdge(0, 2);
		b.addEdge(1, 3);
		b.addEdge(2, 4);
		b.addEdge(3, 5);
		b.addEdge(4, 5);
		b.addEdge(4, 6);

		System.out.println(b.ifGraphConnected());
	}

}