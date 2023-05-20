import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteAround {
    public static void main(String[] args) {
        // # Recall -> Lambda can be used only in the context of functional interface
        // Signature: BufferReader -> String and may throw an
        try {
            String oneLine = processFile((BufferedReader br) -> br.readLine());
            String twoLines = processFile((BufferedReader br) -> br.readLine() + br.readLine());

            System.out.println(oneLine);
            System.out.println("==================");
            System.out.println(twoLines);

        } catch(IOException e){
            System.out.println("inside error");
            System.out.println(e);
        }

    }

    public static String processFile(BufferReaderProcessor p) throws IOException {
        // We could wrap statement that will throw exception inside () of try instead of using catch
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"));) {
            // Process the BufferReader object
            return p.process(br);
        }
    }
}
