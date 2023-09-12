package Assignments;
import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
       Scanner userInput = new Scanner(System.in);
       int decision;
        do {
            System.out.print("Enter first number : ");
            int firstNumber = userInput.nextInt();
            System.out.print("Enter a second number: ");
            int secondNumber = userInput.nextInt();
            int sum = firstNumber + secondNumber;
            System.out.printf("The sum of the numbers entered is: %d%n",sum);
            System.out.print("do you want to perform another operation ? press 1");

             decision = userInput.nextInt();

        }while (decision==1);

        }

    }
