package chapterTwoExercises;

import java.util.Scanner;

public class FoodOrder {
        public static void main(String[] args){
            System.out.println("Enter Yes or No to decide if your famished or not");
            Scanner keyboardInput = new Scanner(System.in);
              System.out.print("hungry type!!: ");
                String userInput = keyboardInput.nextLine();
                  if(userInput.equals( "yes")){
                    System.out.println("Bro go buy food");
                  }else if (userInput.equals("no")){
                         System.out.println("Abeg gettat");
            }






    }
}
