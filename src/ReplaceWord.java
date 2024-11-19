import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReplaceWord {
    public static void main(String[] args) {
        String inputPath = "src\\ReplaceWord\\input.txt";
        String outputPath = "src\\ReplaceWord\\output.txt";
        String searchWord = "Java";
        String replaceWord = "HTML";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            String currentLine = reader.readLine();
            while (currentLine != null) {
                String[] words = currentLine.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (words[i].equals(searchWord)) {
                        words[i] = replaceWord;
                    }
                }
                writer.write(String.join(" ", words));
                writer.newLine();
                currentLine = reader.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
