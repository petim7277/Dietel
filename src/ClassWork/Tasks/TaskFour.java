package ClassWork.Tasks;

public class TaskFour {
    public static void main(String[] args) {
        int sumOfEvenNumbers = 0;
        for (int count = 1; count <= 10 ; count++) {
            if (count % 2 == 0)
             sumOfEvenNumbers = sumOfEvenNumbers + count  ;
        }
        System.out.println("Sum of even numbers between one and ten is :"+sumOfEvenNumbers);

    }
}
