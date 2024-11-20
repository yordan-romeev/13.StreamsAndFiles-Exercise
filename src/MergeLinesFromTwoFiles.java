import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class MergeLinesFromTwoFiles {
    public static void main(String[] args) {
        String inputPath1 = "src\\MergeLinesFromTwoFiles\\input1.txt";
        String inputPath2 = "src\\MergeLinesFromTwoFiles\\input2.txt";
        String outputPath = "src\\MergeLinesFromTwoFiles\\output.txt";

        try (BufferedReader reader1 = new BufferedReader(new FileReader(inputPath1));
             BufferedReader reader2 = new BufferedReader(new FileReader(inputPath2));
             PrintWriter writer = new PrintWriter(outputPath)) {
            boolean bothInputsFinished = false;
            boolean input1Finished = false;
            boolean input2Finished = false;
            boolean readFromFirstFile = true;

            while (!bothInputsFinished) {
                String currentLine;
                if (readFromFirstFile) {
                    currentLine = reader1.readLine();
                    if (currentLine == null) {
                        input1Finished = true;
                        if (input2Finished) {
                            bothInputsFinished = true;
                        }
                    } else {
                        writer.println(currentLine);
                    }
                    readFromFirstFile = false;
                } else {
                    currentLine = reader2.readLine();
                    if (currentLine == null) {
                        input2Finished = true;
                        if (input1Finished) {
                            bothInputsFinished = true;
                        }
                    } else {
                        writer.println(currentLine);
                    }
                    readFromFirstFile = true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
