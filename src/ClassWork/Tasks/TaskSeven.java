package ClassWork.Tasks;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int result = 0;
        for (int count = 1; count <= 10 ; count++) {
            System.out.print("Enter a score: ");
            int userInput = keyboardInput.nextInt();
            if (userInput <= 100){
             result = result + userInput;
            }
        }
        System.out.println("Sum of valid scores entered is:"+result);
    }
}
