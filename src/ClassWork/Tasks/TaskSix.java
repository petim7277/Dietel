package ClassWork.Tasks;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int totalScore = 0;
        int average = 1;
        int count;
        int counter = 0;
        for (count = 1; count <= 10; count++) {
            System.out.print("Enter a number: ");
            int userInput = keyboardInput.nextInt();
            if (userInput % 2 == 0) {
                totalScore = totalScore + userInput;
                counter += 1;
                average = totalScore / counter;
            } System.out.println("Average of even numbers is: " + average);
            
        }
    }
}