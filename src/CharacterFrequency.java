import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String inputPath = "src\\CharacterFrequency\\input.txt";
        Map<Character, Integer> characterFrequencies = new LinkedHashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {
            int currentChar = reader.read();

            while (currentChar != -1) {
                if (characterFrequencies.containsKey((char) currentChar)) {
                    characterFrequencies.replace((char) currentChar, characterFrequencies.get((char) currentChar) + 1);
                } else {
                    characterFrequencies.put((char) currentChar, 1);
                }

                currentChar = reader.read();
            }

            for (Map.Entry<Character, Integer> entry : characterFrequencies.entrySet()) {
                System.out.printf("%s : %d%n", entry.getKey(), entry.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
