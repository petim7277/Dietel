package Assignments;

import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        int positive = 0 ;
        int negative = 0;
        int zero =0;
    Scanner myScanner = new Scanner(System.in);
    Scanner input = new Scanner(System.in);


     while (true){
         System.out.print("Enter a number : ");
         int userInput = myScanner.nextInt();
         if (userInput >0) {positive ++;}
         if (userInput <0){ negative++;}
         if (userInput ==0) {zero++;}
         System.out.println("Press * to end operation \n press any number to countinue operation.");
         System.out.print("Enter a number : ");
     String secondInput = input.nextLine();
     if (secondInput.equals("*"))
         break;
    }
        System.out.printf("Count of numbers is: >>> "+positive+"\n" +
                "Negative " + negative+" Zero\n"+zero);








    }
}
