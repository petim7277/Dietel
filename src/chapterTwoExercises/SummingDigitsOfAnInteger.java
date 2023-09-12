package chapterTwoExercises;
import java.util.Scanner;
public class SummingDigitsOfAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 -1000 : ");
     int   firstNumber = input.nextInt();
     int first1 =firstNumber%10;
     int first2 = firstNumber/10;
     int first3 = first2/10;
     int first4 = first1 +first2+first3;
        System.out.printf("The sum of the digit is :%d ",first3);
    }
}
