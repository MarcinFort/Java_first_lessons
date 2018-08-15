import java.util.HashMap;

public class AHashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> object = new HashMap<String, Integer>();
        System.out.println(object);

        object.put("John", 24);
        object.put("Harry", 30);
        object.put("Dennis", 20);

        System.out.println(object);

        System.out.println( object.get("John") );

        System.out.println( object.size() );

        for (String name : object.keySet()) {
            System.out.println("My friend " + name + " is " + object.get(name) + " years old.");
        }

    }

} 