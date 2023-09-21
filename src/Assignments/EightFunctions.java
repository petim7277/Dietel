package Assignments;

public class EightFunctions {


    public void print(String word) {
        System.out.print(" ");
    }
    public boolean evenOrOddNumbers(int numberEntered){
        if (numberEntered %2 == 0  ){
                    return true;
        }
        return false;
    }

    public boolean primeNumbers(int userInput) {
        for (int count = 0; count > 0; count++) {
              if (userInput % 2 == 0 && userInput % userInput ==0){
                  return true;
              }else if (userInput %2 != 0 && userInput % userInput !=0 ){
                  return false;
              }
        }

        return false;
      }
      public int subtractor(int numberOne , int numberTwo) {
          int total = 0;
          if (numberOne < numberTwo) {
              int result = numberOne - numberTwo;
              return Math.abs(result);
          } else if (numberTwo > numberOne) {
              total = numberTwo - numberOne;
              return total;

          }

         return total;
      }


 }
