package chapterTwoExercises;
import java.util.Scanner;
public class Energy {



        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("enter weight of water in kilograms:  ");
            double user1 = input.nextDouble();

            System.out.print("enter the initial temperature : ");
            double user2 = input.nextDouble();

            System.out.print("enter the final temperature: ");
            double user3 = input.nextDouble();

            double quantity = user1 *(user3-user2)* 4184;


            System.out.printf("the energy needed is  : %.4f%n", quantity);

        }
}
