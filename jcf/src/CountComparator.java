import java.util.Comparator;

public class CountComparator implements Comparator<Count> {
    public int compare(Count c1, Count c2){
        if(c1 != null && c2 != null){
            // Ascending order
            return (c2.count - c1.count);
        } else {
            return 0;
        }
    }
}
