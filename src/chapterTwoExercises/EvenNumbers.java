package chapterTwoExercises;
import java.util.Scanner;
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of your choice:");
        int number = input.nextInt();

                if (number %2 ==0){
                    System.out.println("even number:");
                }
        if (number %2 != 0){
            System.out.println("odd number:");
        }
    }


}
