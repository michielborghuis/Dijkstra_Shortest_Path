package Dijkstra5;

import org.junit.Test;

import static org.junit.Assert.*;

public class StapTest {
    Stap s01 = new Stap(0, 10, 2, 20, "autoRit");
    Stap s02 = new Stap(0, 15, 3, 30, "autoRit");
    Stap s13 = new Stap(1, 12, 2, 24, "autoRit");
    Stap s15 = new Stap(1, 15, 3, 30, "autoRit");
    Stap s24 = new Stap(2, 10, 2, 20, "autoRit");
    Stap s35 = new Stap(3, 1, 1, 2, "autoRit");
    Stap s34 = new Stap(3, 2, 1, 4, "autoRit");
    Stap s54 = new Stap(5, 5, 1, 10, "treinRit");



    @Test
    public void getName() {
        assertEquals(s54.getName(), 5);
    }

    @Test
    public void getDistance() {
        assertEquals(s34.getDistance(), 2);
    }

    @Test
    public void getPrice() {
        assertEquals(s01.getPrice(), 2);
    }

    @Test
    public void getMinutes() {
        assertEquals(s13.getMinutes(), 24);
    }

    @Test
    public void compare() {
        assertEquals(s01.compare(s35, s24), -1);
        assertEquals(s01.compare(s54, s24), 0);
    }
}
