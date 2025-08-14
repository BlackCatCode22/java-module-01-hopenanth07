     // FunWithVariables.java
     // Hope Nanthavongdouangsy 8/14/2025
    //
    // References:
    // https://www.w3schools.com/java/java_user_input.asp

     // import statements are at the top of the program

import java.util.Scanner;

public class FunWithVariables {
    public static void main(String[] args) {
        System.out.println("\n\n\n\n\n *** Welcome to my Fun With Variables Program! \n\n");
        // Create a String variable named anything.
        String anything = " something else ";
        System.out.println(anything);

        // Create a coupe of int variable
        int num1 = 0;
        int num2 = 0;


        // Create a Scanner object named scanner
        Scanner scanner = new Scanner(System.in);

        // Get a value from the user and store it in num1.
        System.out.println("\n Please Enter a whole number for num1: ");
        num1 = scanner.nextInt();

        // Prove that you got an int from user.
        System.out.println(" num1 = " + num1);
    }
}