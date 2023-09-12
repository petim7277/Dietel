package Assignments;

public class ManipulatingVariables {
    public static void main(String[] args) {
        int firstNumber =  1 ;
        int secondNumber = 2 ;
        int thirdNumber = 3  ;

    int holdingNumber=secondNumber;
     secondNumber=thirdNumber;
   thirdNumber=firstNumber;
        System.out.println(holdingNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);

    }
}
