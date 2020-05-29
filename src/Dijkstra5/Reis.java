package Dijkstra5;

import java.util.*;

public class Reis {
    private int[] dist;
    private Set<Integer> settled;
    private PriorityQueue<Stap> pq;
    private String soortReis;
    private List<List<Stap>> adj;
    private int V;

    public Reis(List<List<Stap>> adj, String soortReis){
        this.adj = adj;
        V = adj.size();
        pq = new PriorityQueue<Stap>(V, new Stap());
        this.soortReis = soortReis;
        settled = new HashSet<Integer>();
        dist = new int[V];
    }

    public String getSoortReis(){return soortReis;}

    public int[] getDist(){return dist;}

    public int getV(){return V;}

    //Functie voor Dijkstra's algoritme
    public void dijkstra(int src) {
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        //Voeg source node toe aan priority queue
        pq.add(new Stap(src, 0, 0, 0, soortReis));

        //Afstand tot eerste punt is 0
        dist[src] = 0;
        //!!!
        System.out.println(settled.size());
        while (settled.size() != V) {
            //!!!
            System.out.println(settled.size());
            //verwijder minimale afstand node uit de priority queue
            int u = pq.remove().getName();
            System.out.println(u);

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
            Stap v = adj.get(u).get(i);

            //Als de huidige node nog niet verwerkt is
            if (!settled.contains(v.getName())) {
                edgeDistance = v.getDistance();
                newDistance = dist[u] + edgeDistance;

                //Als de nieuwe cost kleiner is dan huidige
                if (newDistance < dist[v.getName()]) {
                    dist[v.getName()] = newDistance;
                }

                //Voeg huidige node to aan priority queue
                pq.add(new Stap(v.getName(), dist[v.getName()], 2, 2, "autoRit"));
            }
        }
    }
}
