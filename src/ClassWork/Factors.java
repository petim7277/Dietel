package ClassWork;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int userInput = input.nextInt();
        int factor=0;

        for(int count=1; count<=userInput; count++){
            if(userInput % count == 0){
                factor=factor+1;
            }

        }
        System.out.println(factor);

        if (factor == 2){
            System.out.print("is a prime number");
        }else{
            System.out.print("is not a prime number");
        }



    }
}







