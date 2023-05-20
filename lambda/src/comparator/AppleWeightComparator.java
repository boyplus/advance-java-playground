package comparator;

import model.Apple;

import java.util.Comparator;

public class AppleWeightComparator implements Comparator<Apple> {
    public int compare(Apple a1, Apple a2){
        return a1.weight - a2.weight;
    }
}
