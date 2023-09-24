package Assignments;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            System.out.println( " ");
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
        }

        for (int row = 1; row <=4 ; row++) {
            System.out.println(" ");
            for (int column = 4; column >= row; column--) {
                System.out.print("*");
            }

        }










    }
}