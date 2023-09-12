package Assignments;

public class NaturalNumbers {
    public static void main(String[] args) {
        int sum=0;
        for(int count=1;count<=10;count++){
            sum = count + sum;
        }
        System.out.printf("sum of first ten natural numbers :%d",sum);
    }
}
