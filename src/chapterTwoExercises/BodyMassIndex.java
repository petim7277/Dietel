package chapterTwoExercises;
import java.util.Scanner;

public class BodyMassIndex {


        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter First velocity in meters  : ");
            double velocity1 = input.nextDouble();

            System.out.print("Enter Second velocity in seconds  : ");
            double velocity2 = input.nextDouble();

            System.out.print("Enter Time in seconds  : ");
            double time = input.nextDouble();

            double bmi = time / (velocity1 - velocity2);
            System.out.printf("The average acceleration is  %f  : ",bmi);


        }

    }

