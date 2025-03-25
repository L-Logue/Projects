import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pineapple");

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Original Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nOriginal Numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("\nFirst fruit: " + fruits.get(0));
        System.out.println("Second number: " + numbers.get(1));

        fruits.set(1, "Blueberry");
        numbers.set(2, 35);

        System.out.println("\nModified Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nModified Numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        fruits.remove(2);
        numbers.remove(0);

        System.out.println("\nFruits after removal:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nNumbers after removal:");
        for (int num : numbers) {
            System.out.println(num);
        }

        fruits.clear();
        numbers.clear();

        System.out.println("\nFruits after clear(): " + fruits.size() + " items");
        System.out.println("Numbers after clear(): " + numbers.size() + " items");
    }
}
