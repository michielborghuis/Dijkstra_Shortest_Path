//package Dijkstra4;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Stap s01 = new Stap(0, 10, 2, 20);
//        Stap s02 = new Stap(0, 15, 3, 30);
//        Stap s13 = new Stap(1, 12, 2, 24);
//        Stap s15 = new Stap(1, 15, 3, 30);
//        Stap s24 = new Stap(2, 10, 2, 20);
//        Stap s35 = new Stap(3, 1, 1, 2);
//        Stap s34 = new Stap(3, 2, 1, 4);
//        Stap s54 = new Stap(5, 5, 1, 10);
//
//        List<List<Stap>> adj = new ArrayList<List<Stap>>();
//        for (int i = 0; i < 6; i++) {
//            List<Stap> item = new ArrayList<Stap>();
//            adj.add(item);
//        }
//
//        adj.get(0).add(s01);
//        adj.get(0).add(s02);
//        adj.get(1).add(s13);
//        adj.get(1).add(s15);
//        adj.get(2).add(s24);
//        adj.get(3).add(s34);
//        adj.get(3).add(s35);
//        adj.get(5).add(s54);
//
//        ArrayList<Integer> unsettled = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
//
//        Reis r1 = new Reis(adj, unsettled, "Autorit");
//        r1.dijkstra(0);
//
//        for (int i = 0; i < r1.getDist().length; i++)
//            System.out.println(0 + " to " + i + " is " + r1.getDist()[i]);
//
//    }
//        int V = 6;
//        int source = 0;
//
//        // Adjacency list representation of the
//        // connected edges
//        List<List<Node>> adj = new ArrayList<List<Node> >();
//
//        // Initialize list for every node
//        for (int i = 0; i < V; i++) {
//            List<Node> item = new ArrayList<Node>();
//            adj.add(item);
//        }
//
//        // Inputs for the DPQ graph
//        adj.get(0).add(new Node(1, 10));
//        adj.get(0).add(new Node(2, 15));
//
//        adj.get(1).add(new Node(3, 12));
//        adj.get(1).add(new Node(5, 15));
//
//        adj.get(2).add(new Node(4, 10));
//
//        adj.get(3).add(new Node(4, 2));
//        adj.get(3).add(new Node(5, 1));
//
//        adj.get(5).add(new Node(4, 5));
//
//
//        // Calculate the single source shortest path
//        Reis reis = new Reis(V);
//        reis.dijkstra(adj, source);
//
//        // Print the shortest path to all the nodes
//        // from the source node
//        System.out.println("The shorted path from node :");
//        for (int i = 0; i < reis.getDist().length; i++)
//            System.out.println(source + " to " + i + " is " + reis.getDist()[i]);
//
//
//
//
//
//
//
//        int V2 = 12;
//        int source2 = 0;
//
//        List<List<Node>> adj2 = new ArrayList<List<Node>>();
//
//        for (int i = 0; i < V2; i++) {
//            List<Node> item2 = new ArrayList<Node>();
//            adj2.add(item2);
//        }
//
//        adj2.get(0).add(new Node(1, 10));
//        adj2.get(0).add(new Node(5, 8));
//
//        adj2.get(1).add(new Node(2, 20));
//
//        adj2.get(2).add(new Node(3, 30));
//
//        adj2.get(3).add(new Node(9, 40));
//
//        adj2.get(4).add(new Node(2, 3));
//        adj2.get(4).add(new Node(8, 9));
//
//        adj2.get(5).add(new Node(4, 2));
//        adj2.get(5).add(new Node(6, 13));
//
//        adj2.get(6).add(new Node(8, 4));
//        adj2.get(6).add(new Node(11, 40));
//
//        adj2.get(7).add(new Node(2, 1));
//
//        adj2.get(8).add(new Node(7, 12));
//        adj2.get(8).add(new Node(9, 7));
//        adj2.get(8).add(new Node(11, 2));
//
//        adj2.get(10).add(new Node(9, 50));
//
//        adj2.get(11).add(new Node(10, 3));
//
//        Reis reis2 = new Reis(V2);
//        reis2.dijkstra(adj2, source2);
//
//        System.out.println("The shorted path from node :");
//        for (int i = 0; i < reis2.getDist().length; i++)
//            System.out.println(source2 + " to " + i + " is " + reis2.getDist()[i]);
//    }
//}
