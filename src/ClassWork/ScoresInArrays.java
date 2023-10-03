package ClassWork;

import java.util.Arrays;
import java.util.Scanner;

public class ScoresInArrays {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int userInput = 0;
        int  sum = 0;
        int average = 0 ;
        int[]listOfScores = new int[11];
        for (int count = 1; count <= listOfScores.length-1 ; count++) {
            System.out.println("Enter your score: ");
            userInput = keyboardInput.nextInt();
            listOfScores[count] = userInput;
            sum = sum + listOfScores[count];
            average = sum / count;
        }
        for (int maximum = 0; maximum <= listOfScores.length-1 ; maximum++) {
            if (listOfScores.length > maximum) ;
        }
        System.out.println( "The Total of Ten scores entered is = "+Arrays.toString (new int[]{sum}));
        System.out.println( "The Average of Ten scores entered is = "+Arrays.toString (new int[]{average}));
        System.out.println("The minimum is = " + Arrays.toString(listOfScores));

    }
}
