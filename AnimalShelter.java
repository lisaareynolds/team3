import java.util.Scanner;

/**
 * @Authors Yash, Daniel, Curtis, Nick
 * The main class of a program that will simulate an animal shelter
 */
public class AnimalShelter {
    Animal[] inventoryArray = new Animal[] {};
    /**
     * The test class for animal shelter
     * @param args an array in which to store String arguments
     */
    public static void main(String[] args) {
        /**
         * Create a scanner to take user input
         */
        Scanner animalScanner = new Scanner(System.in);
        /**
         * Give the user options to check the store's inventory, adopt a pet, or donate one
         */
        System.out.println("Enter 'inventory' to print out the current inventory of available pets");
        System.out.println("Enter 'adopt' to adopt a pet");
        System.out.println("Enter 'donate' to donate a pet");
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
                f = 1;
                break;
            }
            else if (input.equals("adopt")) {
                f = 1;
                break;
            }
            else if (input.equals("inventory")) {
                f = 1;
                break;
            }
            else {
                System.out.println("Please enter one of the 3 listed options");
            }
        }
    }
}