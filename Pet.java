/**
 * Write and code input about 3 test score to find average
 * File: Pet.java
 * Author: Lillie Logue
 * Date: 1/31/2025
 */
public class Pet {
    private String name;

    public Pet() {
        setName("Pet Name");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Pet information:\nName: " + name;
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

