import java.io.BufferedReader;
import java.io.FileReader;

public class WordLengths {
    public static void main(String[] args) {
        String inputPath = "src\\WordsLengths\\input.txt";
        try(BufferedReader buffReader = new BufferedReader(new FileReader(inputPath))){
            String inputLine = buffReader.readLine();
            while(inputLine != null){
                String[] words = inputLine.split(" ");
                for(String word : words){
                    System.out.print(word.length());
                    System.out.print(" ");
                }

                inputLine = buffReader.readLine();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
