package ClassWork;

import chapterFour.ExcerciseThirtySix;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        ExcerciseThirtySix myExcercise = new ExcerciseThirtySix();
        myExcercise.print("Enter a number : ");
        int userInput = keyboardInput.nextInt();
        int count =0;
         if (userInput > 0){
             for (int i = userInput; i >= 1 ; i--) {
                 count += i*userInput;
System.out.println(userInput+" * "+i+" = "+i * userInput+"  total -> "+count  );

             }
         }
    }
}
