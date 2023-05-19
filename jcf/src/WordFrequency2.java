import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WordFrequency2 {
    public static void main(String[] args) {
        Map words = new TreeMap<String, Count>();
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
        // entrySet() -> return set of Map.Entry<K,V> of map
        Set<Map.Entry<String, Count>> set = words.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            // Map Entry
            Map.Entry<String, Count> entry = (Map.Entry) it.next();
            word = entry.getKey();
            count  = entry.getValue();
            System.out.println(word +" "+count.count);
        }
    }
}