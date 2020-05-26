package Dijkstra;

import java.util.Comparator;
import java.util.LinkedList;

public class Node {

    public String getNaam(){
        return naam;
    }

    public void setNaam(String naam){
        this.naam = naam;
    }
    private String naam;

    public LinkedList<Integer> getRoute() {
        return new LinkedList<Integer>(route);
    }
    public void setRoute(LinkedList<Integer> route){
        this.route = route;
    }
    LinkedList<Integer> route = new LinkedList<>();

    public Node(String nm, LinkedList<Integer> r) {
        naam = nm;
        route = r; }

    public void addStep(Integer s) { route.add(s); }
}
