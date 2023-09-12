package chapterTwoExercises;
import java.util.Scanner;

public class Scarcity {


        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("enter driving distance:  ");
            double  driving = input.nextDouble();

            System.out.print("enter miles per gallon : ");
            double miles = input.nextDouble();

            System.out.print("enter price per gallon : ");
            double price = input.nextDouble();

            double variableA = (driving/miles);
            double varibleB =  (variableA*price);


            System.out.printf("the cost of driving is : %f",varibleB);

        }


    }

