import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class SerializeAndDeserializeMap {
    public static void main(String[] args) {
        String saveFilename = "src\\SerializeAndDeserializeMap\\ser.map";

        Map<String, Integer> studentGrades = new HashMap<>(Map.of(
                "Kano", 4,
                "Sonia", 6,
                "Sub Zero", 5,
                "Shao Khan", 2
        ));

        try (ObjectOutputStream objWriter = new ObjectOutputStream(new FileOutputStream(saveFilename))) {
            objWriter.writeObject(studentGrades);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objReader = new ObjectInputStream(new FileInputStream(saveFilename))) {
            Map<String, Integer> mapFromFile = (Map<String, Integer>) objReader.readObject();
            System.out.println(mapFromFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
