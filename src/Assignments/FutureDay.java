package Assignments;

import java.util.Scanner;

public class FutureDay {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter today's day : ");
        int todaysDay = input.nextInt();
        System.out.print("Enter the number of days elasped since today: ");
        int futureDay = input.nextInt();
        int total =(futureDay % 7) + todaysDay;

                       switch (todaysDay){
                           case 0:
                               System.out.print("Today is Sunday and future day is   ");
                               break;
                           case 1:
                               System.out.print("Today is Monday and future day is  ");
                               break;
                           case 2:
                               System.out.print("Today is Tuesday and future day is ");
                           case 3:
                               System.out.print("Today is Wednesday and future day is  ");
                               break;
                           case 4:
                               System.out.print("Today is Thursday and future day is  ");
                               break;
                           case 5:
                               System.out.print("Today is Friday and future day is  ");
                               break;
                           case 6:
                               System.out.print("Today is Saturday and future day is  ");
                              // break;
                       }


                  switch (total){
                      case 0:
                          System.out.println("Sunday");
                          break;
                      case 1:
                          System.out.println("Monday");
                          break;
                      case 2:
                          System.out.println("Tuesday");
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
                        //  break;
                  }


    }
}
