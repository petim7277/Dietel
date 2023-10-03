package ClassWork.Tasks;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int totalScore = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter a number: ");
            int userInput = keyboardInput.nextInt();
            if (userInput % 2 == 0)
             totalScore = totalScore + userInput;

        }
        System.out.println("sum of ten even numbers in scores entered is:"+totalScore);
    }
}