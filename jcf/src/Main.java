import java.util.*;

public class Main {
    public static void main(String[] args) {

        //       Collection                                            Map
        //          List                   Set              HashMap   Hashtable  SortedMap
        //   ArrayList LinkedList  HashSet   SortedSet                            TreeMap
        //                                    TreeSet

        // Notice that everything that is sorted will be stored in Tree :-

        // Collection
        // 1. List
        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple("red",1));
        apples.add(new Apple("green",4));
        apples.add(new Apple("purple",2));

        printApples(apples);

        // 2. Set
        // HashSet
        Set<String> names = new HashSet<>();
        System.out.println("HashSet");
        names.add("thanaphon");
        names.add("jirasin");
        names.add("thanaphon");
        printNames(names);

        // SortedSet
        names = new TreeSet<>();
        System.out.println("TreeSet");
        names.add("thanaphon");
        names.add("jirasin");
        names.add("thanaphon");
        printNames(names);

        // Map
        // HashMap
        Map<String, Integer> scores = new HashMap<>();
        scores.put("thanaphon",89);
        scores.put("jirasin",97);
        // Put same key will update value
        scores.put("thanaphon",91);

        printScores(scores);

    }

    public static void printApples(List<Apple> apples){
        // 1. For each -> easy to read, want to process all el
        for(Apple apple : apples){
            System.out.println(apple.name+" "+apple.weight);
        }

        // 2. While loop -> might want to stop part through way, use for repetition
        // that does not involve a collection
        int index = 0;
        while(index < apples.size()){
            Apple apple = apples.get(index);
            System.out.println(apple.name+" "+apple.weight);
            index++;
        }

        // 3. Iterator object use when index access is not efficient or impossible
        Iterator<Apple> it = apples.iterator();
        while(it.hasNext()){
            Apple apple = it.next();
            System.out.println(apple.name+" "+apple.weight);
        }
    }

    public static void printNames(Set<String> names){
        // For each
        for(String name : names){
            System.out.println(name);
        }

        // Iterator
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void printScores(Map<String, Integer> scores){
        // Need to get key set for both way

        Set<String> keys = scores.keySet();
        System.out.println("Print gel key set");
        for(String key : keys){
            // Can use both Integer or int (from auto-boxing)
            int score = scores.get(key);
            System.out.println(score);
        }

        // 2. Iterator through keys
        System.out.println("Print from key set iterator");
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            int score = scores.get(it.next());
            System.out.println(score);
        }
    }
}