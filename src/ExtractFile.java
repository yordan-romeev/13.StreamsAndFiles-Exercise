import java.io.File;

public class ExtractFile {
    public static void main(String[] args) {
        File file = new File("src\\ExtractFile\\one.more.test.txt");

        String filename = file.getName().substring(0, file.getName().lastIndexOf('.'));
        String extension = file.getName().substring(file.getName().lastIndexOf('.') + 1);
        System.out.printf("File name: %s%n", filename);
        System.out.printf("File extension: %s%n", extension);
        System.out.printf("File size: %d bytes%n", file.length());
    }
}
