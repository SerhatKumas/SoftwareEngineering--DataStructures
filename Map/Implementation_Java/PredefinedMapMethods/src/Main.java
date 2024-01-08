import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Map creation using hash map
        Map<String, String> database = new HashMap<>();

        //Adding elements to map
        database.put("12345678910", "David People");
        database.put("12345678911", "Karen Brooks");
        database.put("12345678912", "John Doe");

        System.out.println(database.values());

        //Removing element from the map
        database.remove("12345678911");

        System.out.println(database.values());

        //Displaying all the keys in the map
        System.out.println(database.keySet());

        //Displaying all the values in the map
        System.out.println(database.values().toString());
    }
}