package Assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int firstNumber = input.nextInt();
        int factorial = 1;
for(int count=1;   count <=firstNumber;count++){
    factorial=factorial * count;

   }
        System.out.print(factorial);

    }
}
