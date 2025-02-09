public class Pet {
    private int age;
    private String name;
    private String type;

    // Default Constructor
    public Pet() {
        name = "Pet Name";
        type = "Animal";
        age = 1;
    }

    // Parameterized Constructor
    public Pet(String newName, String newType, int newAge) {
        setName(newName);
        setType(newType);
        setAge(newAge);
    }

    // Accessors (Getters)
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    // Mutators (Setters)
    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setType(String newType) {
        type = newType;
    }

    // Speak method based on pet type
    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Yowl";
        }
    }

    // toString method to display pet information
    public String toString() {
        return "Pet Information:\n" +
                "Type: " + type + "\n" +
                "Name: " + name + "\n" +
                "Sound: " + speak() + "\n" +
                "Age: " + age;
    }
}
