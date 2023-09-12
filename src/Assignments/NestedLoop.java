package Assignments;

public class NestedLoop {
    public static void main(String[] args) {
        int triangle=6;
        for(int count =1; count<= triangle; count++){
            for(int count2=1; count2<= count; count2++ )
            {
                System.out.print(count2  );
            }
            for (int row= 1; row<=triangle;row++){
                System.out.print(" ");
            }
            for (int row=count; row<=triangle;row++){
                System.out.print(row  );
            }
            System.out.println(" ");

        }
    }
}
