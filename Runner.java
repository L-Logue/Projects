import java.util.Scanner;

public class Runner {
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
