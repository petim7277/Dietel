package chapterTwoExercises;
import java.util.Scanner;

public class Remainder {


        public static void main(String[] args){
            Scanner input= new Scanner(System.in);

            System.out.print("Enter a number between 0 and 1000 :  ");
            int user1=input.nextInt();
            int prepare =user1 % 10;
            int finished = user1 / 10;
            double sum= prepare+finished;
            System.out.printf("The sum of the digits is :%f" , sum);

        }

    }
