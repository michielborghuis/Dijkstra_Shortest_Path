package Dijkstra4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int V = 6;
        int source = 0;

        // Adjacency list representation of the
        // connected edges
        List<List<Node>> adj = new ArrayList<List<Node> >();

        // Initialize list for every node
        for (int i = 0; i < V; i++) {
            List<Node> item = new ArrayList<Node>();
            adj.add(item);
        }

        // Inputs for the DPQ graph
        adj.get(0).add(new Node(1, 10));
        adj.get(0).add(new Node(2, 15));

        adj.get(1).add(new Node(3, 12));
        adj.get(1).add(new Node(5, 15));

        adj.get(2).add(new Node(4, 10));

        adj.get(3).add(new Node(4, 2));
        adj.get(3).add(new Node(5, 1));

        adj.get(5).add(new Node(4, 5));


        // Calculate the single source shortest path
        Reis reis = new Reis(V);
        reis.dijkstra(adj, source);

        // Print the shortest path to all the nodes
        // from the source node
        int[] distance = Reis.getDist();
        System.out.println("The shorted path from node :");
        for (int i = 0; i < distance.length; i++)
            System.out.println(source + " to " + i + " is " + distance[i]);
    }
}
