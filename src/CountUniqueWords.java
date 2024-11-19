import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CountUniqueWords {
    public static void main(String[] args) {
        String inputPath = "src\\CountUniqueWords\\input.txt";
        try (BufferedReader buffReader = new BufferedReader(new FileReader(inputPath))) {
            String inputLine = buffReader.readLine();
            Set<String> uniqueWords = new HashSet<>();

            while (inputLine != null) {
                String[] words = inputLine.split("[ .]+");
                Collections.addAll(uniqueWords, words);

                inputLine = buffReader.readLine();
            }

            System.out.printf("Unique words: %d", uniqueWords.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
