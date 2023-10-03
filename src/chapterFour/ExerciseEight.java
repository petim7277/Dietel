package chapterFour;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int firstInput ;
        int secondInput;
        int miles = 0;
        int gallons = 0 ;
        int result = 0 ;
        System.out.println("Enter -1 to stop operation");
        for (int count = 0; count > 0 ; count++) {
            System.out.println("Enter miles driven: ");
             firstInput = keyboardInput.nextInt();
            System.out.println("Enter gallons used: ");
            secondInput = keyboardInput.nextInt();
            if (firstInput > 0 && secondInput > 0){
             miles = miles + firstInput;
             gallons = gallons + secondInput;
             result = miles + gallons ;
            }
        }
        System.out.println("The result of miles driven is =  "+miles);
        System.out.println("The result of gallons used  is =  "+gallons);
        System.out.println("The result of miles driven and gallons used is = " + result);
    }
}
