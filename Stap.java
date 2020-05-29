package Dijkstra5;


import java.util.Comparator;

class Stap implements Comparator<Stap> {
    private int name;
    private int distance;
    private int price;
    private int minutes;
    private int cost;

    public Stap(){};

    public Stap(int name, int distance, int price, int minutes, String soortReis){
        this.name = name;
        this.distance = distance;
        this.price = price;
        this.minutes = minutes;
        if (soortReis.equals("vliegReis")){cost = price;}
        else if (soortReis.equals("autoRit")){cost = distance;}
        else if (soortReis.equals("treinRit")){cost = minutes;}
    }

    public int getName(){return name;}

    public int getDistance(){return distance;}

    public int getPrice(){return price;}

    public int getMinutes(){return minutes;}

    @Override
    public int compare(Stap stap1, Stap stap2)
    {
        if (stap1.cost < stap2.cost)
            return -1;
        if (stap1.cost > stap2.cost)
            return 1;
        return 0;
    }
}
