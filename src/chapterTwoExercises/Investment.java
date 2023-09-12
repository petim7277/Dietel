package chapterTwoExercises;
import java.util.Scanner;

public class Investment {


        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter investment amount:  ");
            double user1 = input.nextDouble();

            System.out.print("Enter annual interest rate in percentage: ");
            double user2 = input.nextDouble();

            System.out.print("enter number of years : ");
            double user3 = input.nextDouble ();

            double here = input.nextDouble();
            double total = user1*(1+here)*12;


            System.out.printf("the energy needed is  : %f%n", total);

        }


    }

