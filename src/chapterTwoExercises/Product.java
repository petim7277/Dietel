package chapterTwoExercises;
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int firstNumber=input.nextInt();
        System.out.println("Enter a number :");
        int secondNumber = input.nextInt();
        System.out.println("Enter a number :");
        int thirdNumber = input.nextInt();

        int multiplication=firstNumber * secondNumber *thirdNumber;
        System.out.printf("The product of given numbers are:%d",multiplication);
    }
}
