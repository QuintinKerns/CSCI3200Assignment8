public class GraphTester {
	public static void main(String[] args) {
		Graph graph = new Graph();
		
		graph.addEdge("Q", "U");
		graph.addEdge("I", "N");
		graph.addEdge("T", "I");
		graph.addEdge("N", "K");
		graph.addEdge("E", "R");
		graph.addEdge("N", "S");
		graph.addEdge("Q", "A");
		graph.addEdge("U", "V");
		graph.addEdge("I", "E");
		graph.addEdge("N", "R");
		graph.addEdge("T", "Y");
		graph.addEdge("I", "A");
		graph.addEdge("N", "B");
		graph.addEdge("L", "C");
		graph.addEdge("G", "A");
		graph.addEdge("A", "L");
		
		System.out.println("Original list: ");
		graph.printOrder();
		System.out.println();
		System.out.println("Indegrees: ");
		graph.printIndegrees();
		System.out.println();
		System.out.println("Post-topological sort: ");
		graph.sortTopologically();
		System.out.println("\nBig O: O(V+E)");
		



	}

}