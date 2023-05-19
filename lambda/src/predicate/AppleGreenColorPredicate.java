package predicate;

import model.Apple;

public class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.color.toLowerCase().equals("green");
    }
}
