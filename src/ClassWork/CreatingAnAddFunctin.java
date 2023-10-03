package ClassWork;

public class CreatingAnAddFunctin {
    public int sumDigits(long number){
        int total = 0;
        int moduloNumber = 0;
        int divideNumber ;
       int secondDividedNumber  ;

        for (int count = 1; count <= 3;count++) {
            divideNumber = (int) (number % 10) ;
            secondDividedNumber = (int) (divideNumber %10);
            moduloNumber = (int) (secondDividedNumber % 10);
                total = (int) ( divideNumber + secondDividedNumber + moduloNumber) ;
                System.out.println(total);

        }
        return (int) total;
    }


}
