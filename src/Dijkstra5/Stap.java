package Dijkstra5;

public class Stap {
    private int name;
    private int toName;
    private int distance;
    private int price;
    private int minutes;
    private int cost;

    public Stap(){};

    public Stap(int name, int toName, int distance, int price, int minutes){
        this.name = name;
        this.toName = toName;
        this.distance = distance;
        this.price = price;
        this.minutes = minutes;
    }

    @Override
    public int compare(Stap stap1, Stap stap2){
        if (stap1.distance < stap2.distance)
            return -1;
        if (stap1.distance > stap2.distance)
            return 1;
        return 0;
    }

}
