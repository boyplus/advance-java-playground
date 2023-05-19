package predicate;

import model.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test(Apple apple){
        return apple.weight > 150;
    }
}
