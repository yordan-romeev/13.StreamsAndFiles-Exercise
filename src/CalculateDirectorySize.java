import java.io.File;
import java.util.ArrayDeque;

public class CalculateDirectorySize {
    public static void main(String[] args) {
        String directoryPath = "src//CalculateDirectorySize//";
        File directoryToAnalyze = new File(directoryPath);
        if (directoryToAnalyze.isDirectory()) {
            long totalDirectorySize = getTotalDirectorySize(directoryToAnalyze);
            System.out.printf("Total size: %d bytes", totalDirectorySize);
        } else {
            System.out.println("Not a directory");
        }
    }

    private static long getTotalDirectorySize(File directoryToAnalyze) {
        ArrayDeque<File> folder = new ArrayDeque<>();
        folder.push(directoryToAnalyze);
        long totalDirectorySize = 0;
        while (!folder.isEmpty()) {
            File currentFile = folder.pop();
            for (File file : currentFile.listFiles()) {
                if (file.isDirectory()) {
                    folder.push(file);
                } else {
                    totalDirectorySize += file.length();
                }
            }
        }
        return totalDirectorySize;
    }
}
