package Dijkstra;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;


public class NodeTest {

    Node A;
    Node B;

    @Before
    public void setup(){

        LinkedList<Integer> stepsA = new LinkedList<>();
        stepsA.add(1);
        A = new Node("A", stepsA);
        B = new Node("B", new LinkedList<Integer>());
    }
    
    @Test
    public void getRoute() {
        assertTrue(A.getRoute().size() == 1);
        assertTrue(A.getRoute().get(0) == 1);

        B.setRoute(new LinkedList<>(A.getRoute()));

        assertEquals(A.getRoute(), B.getRoute());

        B.addStep(2);

        assertNotEquals(A.getRoute(), B.getRoute());
    }

    @Test
    public void setRoute() {
        LinkedList<Integer> stepsA = new LinkedList<>();
        stepsA.add(1);
        Node A = new Node("A", stepsA);
        Node B = new Node("B", new LinkedList<Integer>());
    }

    @Test
    public void addStep() {
    }
}