/**
 * Write and code input about the value Pet a object that should have a name
 * File: Pet.java
 * Author: Lillie Logue
 * Date: 1/31/2025
 */
public class Pet {
    private String name;

    public Pet() {
        setName("Pet Name");
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return name;
    }
    public String toString() {
    return "Pet Information:\n" +
           "Name: " + name;
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet();
        System.out.println(pet1);
        System.out.println();

        Pet pet2 = new Pet();
        pet2.setName("Buster");
        System.out.println(pet2);
    }
}

