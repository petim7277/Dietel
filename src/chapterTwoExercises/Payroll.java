package chapterTwoExercises;
import java.util.Scanner;

public class Payroll {


        public static void main(String[] args){
            Scanner input = new Scanner(System.in);


            System.out.print("Enter your first salary :  ");
            int firstPay = input.nextInt()  ;

            System.out.print("Enter your last salary :  ");
            int secondPay = input.nextInt ();

            int totalPay = firstPay + secondPay ;
            System.out.printf("Your current payroll is   %d:",totalPay);

//this program calculates your monthly payroll .

    }
}
