import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ExtractSpecificFilesFromZipArchive {
    public static void main(String[] args) {
        String zipFileName = "src\\ExtractSpecificFilesFromZipArchive\\archive.zip";
        String extractedFilesDirectory = "src\\ExtractSpecificFilesFromZipArchive\\extracted_files\\";

        try (ZipInputStream zipReader = new ZipInputStream(new FileInputStream(zipFileName))) {
            ZipEntry currentZipEntry;

            while ((currentZipEntry = zipReader.getNextEntry()) != null) {
                String entryName = currentZipEntry.getName();
                if (entryName.endsWith(".txt")) {
                    File fileName = new File(extractedFilesDirectory + entryName);
                    fileName.getParentFile().mkdirs();

                    try (FileOutputStream writer = new FileOutputStream(fileName)) {
                        writer.write(zipReader.readAllBytes());
                    }
                    zipReader.closeEntry();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}