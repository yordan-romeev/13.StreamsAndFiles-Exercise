import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeCustomObjectList {
    public static void main(String[] args) {
        String serializeFileName = "src\\SerializeCustomObjectList\\SerialisedPersons.obj";

        Person person1 = new Person("Peter", 25);
        Person person2 = new Person("Maya", 33);
        List<Person> personsToSerialize = new ArrayList<>();
        personsToSerialize.add(person1);
        personsToSerialize.add(person2);

        try (ObjectOutputStream objWriter = new ObjectOutputStream(new FileOutputStream(serializeFileName))) {
            objWriter.writeObject(personsToSerialize);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objReader = new ObjectInputStream(new FileInputStream(serializeFileName))) {
            List<Person> personsDeserialized = (List<Person>) objReader.readObject();
            System.out.println(personsDeserialized);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
