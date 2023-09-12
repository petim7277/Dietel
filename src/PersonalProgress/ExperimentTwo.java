package PersonalProgress;

import java.util.Scanner;

public class ExperimentTwo {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        Scanner newScanner= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = myScanner.nextInt();
        Experiment myExperiment = new Experiment();
        int positiveNumber=0;
        int negativeNumber=0;
        int zeroS=0;

        while (true){
            System.out.print("Enter a number: ");
            userInput=myScanner.nextInt();
            if (userInput>0 ){
               positiveNumber++;
            }
            if(userInput<0) {
                negativeNumber++;
            }
            if (userInput == 0) zeroS++;
            String newInput=newScanner.nextLine();
                if(newInput.equals("#")){
                    Experiment.importantZero( positiveNumber,negativeNumber,zeroS);
                    break;
                }
            System.out.print("Enter '#' to stop entering numbers and enter numbers continue process");

            System.out.printf("positive "+positiveNumber+"\n negative Number "+negativeNumber+"\nNumbers of Zero "+zeroS);
            }
        }

}
