//package Dijkstra4;
//
//import java.lang.reflect.Array;
//import java.util.*;
//
//public class Reis {
//    private int[] dist;
//    private ArrayList<Integer> settled;
//    private ArrayList<Integer> unsettled;
//    private PriorityQueue<Node> pq;
//    private int V; // Aantal punten
//    private List<List<Stap>> adj;
//    private String soortReis;
//
//    public Reis(List<List<Stap>> adj, ArrayList<Integer> unsettled, String soortReis){
//        this.adj = adj;
//        V = adj.size();
//        dist = new int[V];
//        settled = new ArrayList<>();
//        pq = new PriorityQueue<Node>(V, new Node());
//        this.soortReis = soortReis;
//    }
//
//    public int[] getDist(){
//        return dist;
//    }
//
//    //Functie voor Dijkstra's algoritme
//    public void dijkstra(int src) {
//        for (int i = 0; i < V; i++) {
//            dist[i] = Integer.MAX_VALUE;
//        }
//
//        //Voeg source node toe aan priority queue
//        pq.add(new Node(src, 0));
//
//        //Afstand tot eerste punt is 0
//        dist[src] = 0;
//        while (settled.size() != V) {
//
//            //verwijder minimale afstand node uit de priority queue
//            int u = pq.remove().node;
//            System.out.println(u);
//
//            //voeg node toe waarvan de afstand bepaald is
//            settled.add(u);
//
//            e_Neighbours(u);
//        }
//    }
//    //functie om alle neighbours van de vorig node te verwerken
//    private void e_Neighbours(int u){
//        int edgeDistance = -1;
//        int newDistance = -1;
//
//        //Alle neighbours van v
//        for (int i = 0; i < adj.get(u).size(); i++){
//            Node v = adj.get(u).get(i);
//
//            //Als de huidige node nog niet verwerkt is
//            if (!settled.contains(v.node)) {
//                edgeDistance = v.cost;
//                newDistance = dist[u] + edgeDistance;
//
//                //Als de nieuwe cost kleiner is dan huidige
//                if (newDistance < dist[v.node]) {
//                    dist[v.node] = newDistance;
//                }
//
//                //Voeg huidige node to aan priority queue
//                pq.add(new Node(v.node, dist[v.node]));
//            }
//        }
//    }
//}
