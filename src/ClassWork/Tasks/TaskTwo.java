package ClassWork.Tasks;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int totalScore = 0;
        int average = 0;
        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter a number: ");
            int userInput = keyboardInput.nextInt();
            totalScore = totalScore  + userInput;
            average = totalScore / count;
        }
        
        System.out.print("the average of numbers entered is: "+average);
    }
}
