package model;

public class Apple {
    public int weight;
    public String color;

    public Apple(){
        this(0,"");
    }

    public Apple(int weight){
        this(weight, "");
    }

    public Apple(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    public int getWeight(){
        return this.weight;
    }
}
