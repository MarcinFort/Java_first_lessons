import java.util.ArrayList;

public class TemperaturesArray {

    public static void main(String[] args) {

        // ArrayList is a dynamic type of array; useful when array manipulation is necessary
        
        ArrayList<Integer> temperatures = new ArrayList<Integer>();
        
        // Adding items to an array: method add(item)

        temperatures.add(23);
        temperatures.add(30);
        temperatures.add(12);
        
        System.out.println(temperatures);

        // Accessing an item at a specific index: method get(index)

        System.out.println(temperatures.get(0));
        
        // Adding at a specific index: add(index, item);

        temperatures.add(0, 1);
        
        System.out.println(temperatures);
        System.out.println(temperatures.get(0));

        // We may iterate over an ArrayList with a for loop
        // Method size() serves for establishing length of the array

        for (int i = 0; i < temperatures.size(); i++) {
            System.out.println("Loop: " + i + " " + temperatures.get( i ) );
        }

        // 'For each' loop in Java:

        for (Integer temp : temperatures) {
            System.out.println("For each loop: " + temp);
        }

    }

}