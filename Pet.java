/**
 * Write and code input about the value Pet object a object that should have a name
 * File: Pet.java
 * Author: Lillie Logue
 * Date: 02/05/2025
 */
public class Pet {
    private int age;
    private String name;
    private String type;
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
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setType(String newType) {
        type = newType;
    }
    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Noise";
        }
    }
    public String toString() {
        return "Pet Information:\n" +
                "Type: " + type + "\n" +
                "Name: " + name + "\n" +
                "Sound: " + speak() + "\n" +
                "Age: " + age;
    }
}
