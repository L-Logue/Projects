import java.util.Scanner;

public class Pet {
    private String name;
    private String type;
    private int age;

    public Pet() {
        name = "Pet Name";
        type = "Animal";
        age = 1;
    }

    public Pet(String newName, String newType, int newAge) {
        setName(newName);
        setType(newType);
        setAge(newAge);
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setType(String newType) {
        type = newType;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Yowl";
        }
    }

    public String toString() {
        return "Pet Information:\n" +
               "Type: " + type + "\n" +
               "Name: " + name + "\n" +
               "Sound: " + speak() + "\n" +
               "Age:  " + age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pet pet1 = new Pet();
        System.out.println(pet1);
        System.out.println();

        Pet pet2 = new Pet("Buster", "Dog", 11);
        System.out.println(pet2);
        System.out.println();

        System.out.println("Enter animal type:");
        String userType = scanner.nextLine();

        System.out.println("Enter animal name:");
        String userName = scanner.nextLine();

        System.out.println("Enter animal age:");
        int userAge = scanner.nextInt();

        Pet pet3 = new Pet(userName, userType, userAge);
        System.out.println();
        System.out.println(pet3);

        scanner.close();
    }
}
