package PersonalProgress;

public class KillingMyFearsOnLoops {
    public static void main(String[] args) {
        //sumOfNaturalNumbers(10) ;
        //raisedToPowerOfNumber(3,4);
        Factorial(5);

    }

    //        for (int i = 5; i > 0; i--) {
//            System.out.println(i+ " * "+ 6+" = "+ i * 6 );
    //  }
//        for (int i = 0; i <13 ; i++) {
//            System.out.println(i+"*"+1+"="+ i * 1);
//        }
//        System.out.print("""
//               THE MULTIPLICATION TABLE.
//               --------------------------
//                """);
//        for (int i = 1; i < 13; i++) {
//            int multiply = 2*i;
//            System.out.println(i+" * "+2+" =  " +multiply);
//        }
//        for (int i = 1; i <13 ; i++) {
//            System.out.println(i +" * "+3+"=  "+3*i);
//
//        }
    public static int sumOfNaturalNumbers(int number) {
        int sum = 0;
        for (int count = 1; count <= number; count++) {
            sum = sum + count;
        }
        System.out.println(sum);
        return sum;
    }
    public static  int raisedToPowerOfNumber(int firstNumber,int secondNumber){
        int exponential = 1;
        for (int count = 1; count <= secondNumber; count++) {
            exponential = exponential  *firstNumber ;
        }
        System.out.println(exponential);
        return exponential;
    }
  public  int  factorialOfNumber(int number){
   return number;
  }

}
