package Assignments;
import java.util.Arrays;
import java.util.Scanner;

public class FirstArrayTask {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int[] scores = new int[10];
        int maximum = 0;
        int minimum = 0;
        for (int count = 0; count < scores.length; count++) {
            System.out.print("Enter your score: ");
            int userInput = keyboardInput.nextInt();
            scores[count] = userInput;
        }
        maximum = scores[0];
        for (int count = 0; count < scores.length; count++) {
            if (scores[count] > maximum){
                maximum = scores[count]; }
           }
            System.out.println("The highest score is = "+ maximum);

         minimum = scores[0];
        for (int count = 0; count < scores.length ; count++) {
           if (scores[count] < minimum){
              minimum = scores[count];
           }
        }
        System.out.println("The lowest score is =" + minimum);

    }

}

