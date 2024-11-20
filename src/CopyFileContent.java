import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileContent {
    public static void main(String[] args) {
        String inputPath = "src\\CopyFileContent\\input.txt";
        String outputPath = "src\\CopyFileContent\\output.txt";

        try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream(inputPath));
             BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(outputPath))) {

            writer.write(reader.readAllBytes());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
