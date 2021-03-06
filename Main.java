package Dijkstra5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Stap s01 = new Stap(0, 10, 2, 20, "autoRit");
        Stap s02 = new Stap(0, 15, 3, 30, "autoRit");
        Stap s13 = new Stap(1, 12, 2, 24, "autoRit");
        Stap s15 = new Stap(1, 15, 3, 30, "autoRit");
        Stap s24 = new Stap(2, 10, 2, 20, "autoRit");
        Stap s35 = new Stap(3, 1, 1, 2, "autoRit");
        Stap s34 = new Stap(3, 2, 1, 4, "autoRit");
        Stap s54 = new Stap(5, 5, 1, 10, "autoRit");

        List<List<Stap>> adj = new ArrayList<List<Stap>>();
        for (int i = 0; i < 6; i++) {
            List<Stap> item = new ArrayList<Stap>();
            adj.add(item);
        }

        adj.get(0).add(s01);
        adj.get(0).add(s02);

        adj.get(1).add(s13);
        adj.get(1).add(s15);

        adj.get(2).add(s24);

        adj.get(3).add(s34);
        adj.get(3).add(s35);

        adj.get(5).add(s54);

        ArrayList<Integer> unsettled = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));

        Reis r1 = new Reis(adj, "autoRit");
        System.out.println(r1.getSoortReis());
        System.out.println(r1.getV());

        r1.dijkstra(0);
        for (int i = 0; i < r1.getDist().length; i++)
            System.out.println(0 + " to " + i + " is " + r1.getDist()[i]);
    }
}
