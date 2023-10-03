package PersonalProgress;

import java.util.Scanner;

public class PracticingIfStatements {
    //grades from 90 to 60
   public int studentGrade(int score){
       if (score >89 && score <=90){
           System.out.println("A");
       } else if (score >79  && score <= 80) {
           System.out.println("B");
       } else if (score > 69 && score <= 70) {
           System.out.println("C");
       } else if (score >59 && score <= 60) {
           System.out.println("D");
       }
       else {
           System.out.println("grade entered does not correlate with score limit");
       }
       return score;
   }
}