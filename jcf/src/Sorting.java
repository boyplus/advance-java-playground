import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(
                List.of(
                        new Student("boy",85),
                        new Student("jiw",90),
                        new Student("mix",83)
                )
        );

        Collections.sort(students, new ScoreComparator());
        for (Student s:students){
            System.out.println(s.score);
        }
    }
}


class Student {
    public String name;
    public int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class ScoreComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2) {
        // Descending
        return s2.score - s1.score;
    }
}
