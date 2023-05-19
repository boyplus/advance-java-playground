import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WordCount1 {
    public static void main(String[] args) {
        // Also works
        // Set<String> words = new HashSet();
        Set words = new HashSet<String>();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in));

        String delim = " \t\n.,:;?!-/()[]\"\' ";
        String line;
        int count = 0;

        // Count different words
        try{
            while((line =  in.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line, delim);
                while(st.hasMoreElements()){
                    count++;
                    words.add(st.nextToken().toLowerCase());
                }
            }
        } catch(IOException e){ }
        System.out.println("Total number of words: "+count);
        System.out.printf("Number of different words: "+ words.size());
    }
}