package PersonalProgress.arrayPractise;

import java.util.Arrays;
import java.util.Scanner;

public class FirstExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

String[] listOfNames1 = new String[4]; // todo normal array

String[] listOfNames = {"joy", "john","goat"}; //todo initialized array

        for (int i = 0; i < listOfNames1.length; i++) {
            System.out.println("enter your  names >>  "+i);
            String name = scanner.next();
            listOfNames1[i] = name;
        }
        System.out.println(Arrays.toString(listOfNames1));


        for (int i = 0; i < listOfNames1.length; i++) {
            System.out.print("["+listOfNames1[i]+","+"]");
        }
       int a= 5;
       int b = 6;
       int [] c = {15} ;
        System.out.println( c );
    }
}
