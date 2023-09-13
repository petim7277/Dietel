package chapterTwoExercises;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
                System.out.print("Enter an integer : ");
                double userInput = keyboardInput.nextFloat();

                if(userInput % 3 ==0){

                    System.out.print("it divisible");
                }

                if(userInput % 3 !=0){

                    System.out.print("it is not divisible");
                }





    }

}
