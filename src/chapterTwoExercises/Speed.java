package chapterTwoExercises;
import java.util.Scanner;

public class Speed {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter velocity in meters/second :  ");
            double user1 = input.nextDouble();

            System.out.print("Enter acceleration meters/seconds: ");
            double user2 = input.nextDouble();

            double length1=(user1*user1);
            double length2=(user2*2);

            double length3=(length1/length2);

            System.out.printf("The minimum runway length for this airplane is  : %.4f%n", length3);

        }

    }

