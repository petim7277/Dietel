package ClassWork;

public class MultiplicationOperator {
    public static int product(int number, int secondNumber) {
        for (int count = 0; count < secondNumber; count++) {
         number-=secondNumber-1;
        }
        return number;
    }

}
