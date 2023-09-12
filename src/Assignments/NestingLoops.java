package Assignments;

import java.util.Arrays;

public class NestingLoops {
    public static void main(String[] args) {
        int triangle = 6;
        for(int row= 1;row <= triangle; row++){
            System.out.print(row);
            for (int column = row; column <= triangle; column++ ){
                System.out.print(column);
            }
            System.out.println(" ");
        }
    }
}
