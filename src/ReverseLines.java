import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ReverseLines {
    public static void main(String[] args) {
        String inputPath = "src\\ReverseLines\\input.txt";
        String outputPath = "src\\ReverseLines\\output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            String currentLine = reader.readLine();

            while (currentLine != null) {
                StringBuilder lineToReverse = new StringBuilder(currentLine);
                writer.println(lineToReverse.reverse().toString());
                currentLine = reader.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
