import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //-------------------------------1---------------------------------------
        // Header
        System.out.println("-------------------Q1-------------------");

        // 1. Scanner object (for all 3 questions)
        Scanner userInput = new Scanner(System.in);

        // 2. Prompt the user to enter three numbers
        System.out.print("Input the first number: ");
        int num1 = userInput.nextInt();

        System.out.print("Input the second number: ");
        int num2 = userInput.nextInt();

        System.out.print("Input the third number: ");
        int num3 = userInput.nextInt();

        // 3. Call the smallestNumber method and print the result
        System.out.println("The smallest value is " + smallestNumber(num1,num2,num3));
        //-------------------------------2---------------------------------------
        // Header
        System.out.println("-------------------Q2-------------------");

        // 2. Prompt the user to enter three numbers
        System.out.print("Input a number: ");
        int number = userInput.nextInt();

        userInput.nextLine();

        // 3. Call checkNumbers method to check if the entered number is negative or positive or zero
        checkNumbers(number);
        //-------------------------------3---------------------------------------
        // Header
        System.out.println("-------------------Q3-------------------");

        // 2. Printing terms and conditions for the user
        System.out.println("1. A password must have at least eight characters."
                + "\n2. A password consists of only letters and digits."
                + "\n3. A password must contain at least two digits");

        // 3. Prompt the user to enter a password
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = userInput.nextLine();

        // 4. Call checkPassword method
        checkPassword(password,userInput);

        //-----------------------------------------------------------------------
        // Close the scanner
        userInput.close();
    }
    // Q1. Write a Java method to find the smallest number among three numbers.
    public static int smallestNumber(int num1,int num2,int num3){
        // 1. Var to store the smallest number
        int min = 0;

        // 2. Check for the smallest number among the three
        if(num1 < num2 && num1 < num3) min = num1;
        else if (num2 < num1 && num2 < num3) min = num2;
        else min = num3;

        // 3. Return the smallest number
         return min;
    }
    // Q2. Write a Java method that check if the entered number is negative or positive or zero.
    public static void checkNumbers(int number){
        // 1. Check for the conditions and print the result
        if(number < 0) System.out.println("The entered number is negative.");
        else if(number > 0) System.out.println("The entered number is positive.");
        else System.out.println("The entered number is zero.");
    }
    // Q3. Write a Java method to check whether a string is a valid password.
    public static void checkPassword(String password, Scanner userInput) {
        // 1. Loop till the user enter a valid password
        do {
            // 2. Check for the three conditions
            if (password.length() >= 8 && password.matches("[a-zA-Z0-9]+") && password.replaceAll("\\D", "").length() >= 2) {
                System.out.println("Password is valid: " + password);
                break;
            } else if (password.length() < 8) {
                System.out.println("Password is invalid: " + password
                        + "\nThe password must have at least eight characters.");
            } else if (!password.matches("[a-zA-Z0-9]+")) {
                System.out.println("Password is invalid: " + password
                        + "\nThe password must consist of only letters and digits.");
            } else {
                System.out.println("Password is invalid: " + password
                        + "\nThe password must contain at least two digits.");
            }
            // 3. Prompt the user to re-enter the password
            System.out.print("Please enter a valid password: ");
            password = userInput.nextLine();
        } while (true);
    }
}