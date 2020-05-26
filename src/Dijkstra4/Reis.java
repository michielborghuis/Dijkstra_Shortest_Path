package Dijkstra4;

import java.util.*;

public class Reis {
    private static int[] dist;
    private Set<Integer> settled;
    private PriorityQueue<Node> pq;
    private int V; // Aantal punten
    List<List<Node>> adj;

    public Reis(int V){
        this.V = V;
        dist = new int[V];
        settled = new HashSet<>();
        pq = new PriorityQueue<Node>(V, new Node());
    }

    public static int[] getDist(){
        return dist;
    }

    //Functie voor Dijkstra's algoritme
    public void dijkstra(List<List<Node>> adj, int src) {
        this.adj = adj;
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        //Voeg source node toe aan priority queue
        pq.add(new Node(src, 0));

        //Afstand tot eerste punt is 0
        dist[src] = 0;
        while (settled.size() != V) {

            //verwijder minimale afstand node uit de priority queue
            int u = pq.remove().node;

            //voeg node toe waarvan de afstand bepaald is
            settled.add(u);

            e_Neighbours(u);
        }
    }
    //functie om alle neighbours van de vorig node te verwerken
    private void e_Neighbours(int u){
        int edgeDistance = -1;
        int newDistance = -1;

        //Alle neighbours van v
        for (int i = 0; i < adj.get(u).size(); i++){
            Node v = adj.get(u).get(i);

            //Als de huidige node nog niet verwerkt is
            if (!settled.contains(v.node)) {
                edgeDistance = v.cost;
                newDistance = dist[u] + edgeDistance;

                //Als de nieuwe cost kleiner is dan huidige
                if (newDistance < dist[v.node]) {
                    dist[v.node] = newDistance;
                }

                //Voeg huidige node to aan priority queue
                pq.add(new Node(v.node, dist[v.node]));
            }
        }
    }

    // Driver code
    public static void main(String arg[])
    {
        int V = 6;
        int source = 0;

        // Adjacency list representation of the
        // connected edges
        List<List<Node> > adj = new ArrayList<List<Node> >();

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
        System.out.println("The shorted path from node :");
        for (int i = 0; i < reis.dist.length; i++)
            System.out.println(source + " to " + i + " is "
                    + reis.dist[i]);
    }
}
