package chapterTwoExercises;
import  java.util.Scanner;
public class ComparingIntegers {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int firstNumber=input.nextInt();
    int squared = firstNumber * firstNumber;
    if (squared >100) {
        System.out.println("greater than 100");
    }
    if (squared<100){
        System.out.println("less than 100");
    }
        if (squared==100){
            System.out.print("equal to 100");
        }
        if (squared !=100){
            System.out.println("not equal to 100");
        }
    else {
            System.out.printf("number is lessThan 100%d",squared);
    }
}
}