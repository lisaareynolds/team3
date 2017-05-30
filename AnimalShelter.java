import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Authors Yash, Daniel, Curtis, Nick
 * The main class of a program that will simulate an animal shelter
 */
public class AnimalShelter {
    /**
     * The test class for animal shelter
     * @param args an array in which to store String arguments
     */
    public static void main(String[] args) {
        Animal Fido = new GoldenRetriever(4, "Fido");
        Animal Bella = new GermanShepherd(5, "Bella");
        Animal Charlie = new Pug(3, "Charlie");
        Animal Max = new Parakeet(12, "Max");
        Animal Bailey = new Pigeon(2, "Bailey");
        Animal Buddy = new Seagull(8, "Buddy");
        Animal Molly = new Tabby(7, "Molly");
        Animal Lucy = new Siamese(10, "Lucy");
        Animal Daisy = new Ragdoll(13, "Daisy");
        ArrayList<Animal> inventoryArray = new ArrayList<Animal>();
        inventoryArray.add(Fido);
        inventoryArray.add(Bella);
        inventoryArray.add(Charlie);
        inventoryArray.add(Max);
        inventoryArray.add(Bailey);
        inventoryArray.add(Buddy);
        inventoryArray.add(Molly);
        inventoryArray.add(Lucy);
        inventoryArray.add(Daisy);
        /**
         * Create a scanner to take user input
         */
        Scanner animalScanner = new Scanner(System.in);
        /**
         * Give the user options to check the store's inventory or adopt a pet
         */
        System.out.println("Enter 'inventory' to print out the current inventory of available pets");
        System.out.println("Enter 'adopt' to adopt a pet");
        /**
         * Iterate so that if the user enters one of the correct options the action will be performed,
         * and if they don't they will be prompted to do so and the loop will repeat
         */
        int f = 0;
        while (f != 1) {
            /**
             * Assign the latest input to a variable
             */
            String input = animalScanner.nextLine();
            if (input.equals("inventory")) {
                for (int i = 0; i <= inventoryArray.size() - 1; i++) {
                    System.out.println("#" + i);
                    System.out.println("Type: " + inventoryArray.get(i).type());
                    if (inventoryArray.get(i) instanceof Dog) {
                        Dog dog = (Dog)inventoryArray.get(i);
                        System.out.println("Characteristics: " + dog.characteristics());
                    }
                    System.out.println("Name: " + inventoryArray.get(i).getName());
                    System.out.println("Age: " + inventoryArray.get(i).getAge());
                    System.out.println();
                }
                f = 1;
                break;
            }
            else if (input.equals("adopt")) {
                System.out.println("Enter the number of the animal you would like to adopt");
                int adoptInput = Integer.parseInt(animalScanner.nextLine());
                inventoryArray.remove(adoptInput);
                System.out.println("The inventory is now as follows:");
                for (int i = 0; i <= inventoryArray.size() - 1; i++) {
                    System.out.println("#" + i);
                    System.out.println("Type: " + inventoryArray.get(i).type());
                    if (inventoryArray.get(i) instanceof Dog) {
                        Dog dog = (Dog)inventoryArray.get(i);
                        System.out.println("Characteristics: " + dog.characteristics());
                    }
                    System.out.println("Name: " + inventoryArray.get(i).getName());
                    System.out.println("Age: " + inventoryArray.get(i).getAge());
                    System.out.println();
                }
                System.out.println("Take good care of " + inventoryArray.get(adoptInput).getName() + " the " + inventoryArray.get(adoptInput).type());
                f = 1;
                break;
            }
            else {
                System.out.println("Please enter one of the 3 listed options");
            }
        }
    }
}