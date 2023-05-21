package model;

public class Dish {
    private String name;
    private int cal;
    public Dish(String name, int cal){
        this.name = name;
        this.cal = cal;
    }

    public String getName(){
        return name;
    }

    public int getCal() {
        return cal;
    }
}
