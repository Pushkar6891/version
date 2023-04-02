package com.graph.eg009.findnumberofconnectedcomponentsinundirectedgraph;

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

	public int numberOfConnectedComponent() {
		int numberOfConnectedComponent = 0;

		for (int i = 0; i < nodes; i++) {
			if (!visited[i]) {
				dfs(i);
				numberOfConnectedComponent++;
			}
		}

		return numberOfConnectedComponent;
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

		a.addEdge(4, 5);
		a.addEdge(4, 6);

		System.out.println(a.numberOfConnectedComponent());
	}

}