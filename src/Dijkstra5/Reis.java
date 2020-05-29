package Dijkstra5;

import java.util.*;

public class Reis {
    private int[] dist;
    private ArrayList<Integer> settled;
    private ArrayList<Integer> unsettled;
    private PriorityQueue<Stap> pq;
    private String soortReis;
    private List<List<Stap>> adj;
    private int V;

    public Reis(List<List<Stap>> adj, ArrayList<Integer> unsettled, String soortReis){
        this.adj = adj;
        V = adj.size();
        this.unsettled = unsettled;
        pq = new PriorityQueue<Stap>(V, new Stap());
        this.soortReis = soortReis;
    }

    public String getSoortReis(){return soortReis;}

    public int[] getDist(){return dist;}

    public void dijkstra(List<List<Stap>> adj, int src){
        this.adj = adj;
        for (int i = 0; i < V; i++)
            dist[i] = Integer.MAX_VALUE;

        pq.add(new Stap(src, reisClass, 0, 0, 0));

        dist[src] = 0;
        while (settled.size() != V){
            int u = pq.remove().Stap;
        }
    }


}
