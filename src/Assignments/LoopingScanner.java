package Assignments;

import java.util.Scanner;
import java.util.SortedMap;

public class LoopingScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int userInput = input.nextInt();
        int highest = userInput;
        int lowest = userInput;
        for (int count = 0; count <= 1; count++) {
            System.out.print("Enter a number: ");
             userInput = input.nextInt();

            if (userInput > highest) {
                highest = userInput;
            }
            if (userInput < lowest) {
                lowest = userInput;
            }
            System.out.printf("The highest is \n" + highest);
            System.out.printf("The lowest is :%d", lowest);
        }

    }
        }


