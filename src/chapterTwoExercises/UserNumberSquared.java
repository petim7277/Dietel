package chapterTwoExercises;
import java.util.Scanner;
public class UserNumberSquared {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
       System.out.print("Enter any number of your choice:");
           int firstNumber = input.nextInt();
               int  squared1 = (firstNumber * firstNumber);
                 int squared2= (squared1/firstNumber);
                  System.out.printf("The Squareroot of this number is: %d" ,firstNumber+squared2);








    }
}
