package chapterTwoExercises;


import java.util.Scanner;
public class Bodymass {



        public static void main(String[] args){
            Scanner input= new Scanner(System.in);

            System.out.print("enter your weight in pounds :");
            double weight= input.nextDouble();

            System.out.print("enter your height in inches :");
            double height=input.nextDouble();

            double bodyMass = weight / height;
            System.out.println("welldone now check for your BMI");

            System.out.printf("your bodymass is :%n%f", bodyMass);

        }

    }

