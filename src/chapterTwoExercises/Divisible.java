package chapterTwoExercises;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args){
            Scanner keyboardInput = new Scanner(System.in);

            System.out.print("Enter a number :");
            float firstNumber = keyboardInput.nextInt();
            float secondNumber = 3;

            float divisible = firstNumber % secondNumber;

            System.out.printf("the result is %f%n : ", divisible);

    }
}
