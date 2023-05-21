import predicate.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMethodReference {
    private boolean isValidName(String s){
        return Character.isUpperCase(s.charAt(0));
    }

    public List<String> test(){
        List<String> words = Arrays.asList("Boy","boy");
        List<String> filteredWords = filter(words, this::isValidName);
        return filteredWords;
    }

    public List<String> filter(List<String> words, Predicate<String> p){
        List<String> result = new ArrayList<>();
        for(String word:words){
            if(p.test(word)){
                result.add(word);
            }
        }
        return result;
    }
}
