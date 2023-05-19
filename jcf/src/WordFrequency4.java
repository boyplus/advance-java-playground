import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WordFrequency4 {
    public static void main(String[] args) {
        Map words = new HashMap<String, Count>();
        String delim = " \t\n.,:;?!-/()[]\"\' ";
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String line, word;
        Count count;

        try {
            while((line = in.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line, delim);
                while(st.hasMoreTokens()){
                    word = st.nextToken().toLowerCase();
                    count = (Count) words.get(word);
                    if(count == null){
                        words.put(word, new Count(word,1));
                    } else{
                        count.count++;
                    }
                }
            }
        }
        catch(IOException e) {

        }

        Set<String> x = words.keySet();
        // Raw generic type is also fine
        // Ex: List it = new ArrayList<Count>(words.values());
        List<Count> list = new ArrayList<Count>(words.values());
        Collections.sort(list, new CountComparator());

        Iterator<Count> it = list.iterator();
        while(it.hasNext()) {
            count = it.next();
            word = count.word;
            System.out.println(word + " " + word.length());
        }
    }
}
