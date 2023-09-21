package chapterFour;

import java.util.Scanner;

public class ExcerciseThirtySix {
    public void print(String word){
        System.out.println(word);
    }
    public static void main(String[] args) {


    Scanner keyboardInput = new Scanner(System.in);
     ExcerciseThirtySix myexcercise = new ExcerciseThirtySix();
     myexcercise.print("Enter a number : ");
     int firstInput = keyboardInput.nextInt();
     myexcercise.print("Enter a number : ");
     int secondInput = keyboardInput.nextInt();
     if (firstInput > secondInput){
         myexcercise.print("first number is greater than second number");
     } else  if (secondInput > firstInput){
         myexcercise.print("Second number is greater than first number");
     } else{
         myexcercise.print("First and second number are equal");
     }


}
}