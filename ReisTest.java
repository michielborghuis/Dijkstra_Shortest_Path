package Dijkstra5;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ReisTest {

    Stap s01 = new Stap(0, 10, 2, 20, "autoRit");
    Stap s02 = new Stap(0, 15, 3, 30, "autoRit");
    Stap s13 = new Stap(1, 12, 2, 24, "autoRit");
    Stap s15 = new Stap(1, 15, 3, 30, "autoRit");
    Stap s24 = new Stap(2, 10, 2, 20, "autoRit");
    Stap s35 = new Stap(3, 1, 1, 2, "autoRit");
    Stap s34 = new Stap(3, 2, 1, 4, "autoRit");
    Stap s54 = new Stap(5, 5, 1, 10, "autoRit");

    List<List<Stap>> adj = new ArrayList<List<Stap>>();


    Reis r1 = new Reis(adj, "autoRit");

    @Test
    public void getSoortReis() {
        assertEquals(r1.getSoortReis(), "autoRit");
    }


    @Test
    public void getV() {
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
        assertEquals(r1.getV(),  adj.size());
    }

    @Test
    public void dijkstra() {
    }
}
