package PersonalProgress;

public class ComputeExpressions {
    public static void main(String[] args) {
        double numberOne = 9.5 ;
        double numberTwo = 4.5;
        double numberThree = 2.5;
        int numberFour = 3;
        double numberFive = 45.5;
        double numberSix = 3.5;
        double total =  numberOne * numberTwo - numberThree * numberFour / numberFive - numberSix;
        System.out.printf("Your answer is : %f",total);
    }
}
