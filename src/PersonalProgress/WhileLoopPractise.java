package PersonalProgress;

import java.util.Scanner;

public class WhileLoopPractise {
    public static void main(String[] args) {


//        int product = 3;
//        while (product <= 100) {
//            product = 3 * product;
//            System.out.println(product);
//        }
        Scanner input = new Scanner(System.in);
        int total = 0 ;
        int average;
        int gradeCounter = 1;
        while (gradeCounter <= 10){
            System.out.print("Enter grade score :");
            int userInput = input.nextInt();
            total = userInput / gradeCounter;
            gradeCounter = gradeCounter + gradeCounter;
            System.out.println(total);
        }
    }
}