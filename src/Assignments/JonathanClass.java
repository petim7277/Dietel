package  Assignments;

import java.util.Scanner;

public class JonathanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                         Enter numbers between 0 to 6 to show days of the week
                         Enter number here:
                         """);
        int userInput = input.nextInt();

        while (userInput > 6) {
            System.out.print("""
                              Invalid number
                              Enter number here :
                              """);
            userInput = input.nextInt();
        }

            switch (userInput) {
                case 0:
                    System.out.println("sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
            }


    }
}