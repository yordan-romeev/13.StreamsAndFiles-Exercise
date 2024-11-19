import java.io.BufferedReader;
import java.io.FileReader;

public class CountLinesWordsAndCharacters {
    public static void main(String[] args) {
        String inputPath = "src\\CountLinesWordsAndCharacters\\input.txt";
        int lineCount = 0;
        int wordCount = 0;
        int charachterCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {
            String currentLine = reader.readLine();
            while (currentLine != null) {
                lineCount++;
                charachterCount += currentLine.length();
                String[] words = currentLine.split(" ");
                wordCount += words.length;
                currentLine = reader.readLine();
            }

            System.out.printf("Lines: %d; Words: %d; Characters: %d", lineCount, wordCount, charachterCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
