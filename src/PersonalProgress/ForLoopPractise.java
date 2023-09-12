package PersonalProgress;

public class ForLoopPractise {
    public static void main(String[] args) {
       /* int counter= 1;
        for(int count=0;count<5;count++){
           for (int count1=0;count1<counter;count1++ ){
            System.out.print("*");
            }
            counter+=1;
            System.out.println();
        }*/

        int counter2 =1;
        int space = 5;
        for (int count=0;count<5;count++){
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
           for(int count1=0;count1 < counter2;count1++){
               System.out.print(" *");
           }
           space-=1;
           counter2+=1;
            System.out.println(" ");
        }
        int counter3 =1;
        int spaces = 5;
        for (int count=0;count<5;count++){
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for(int count1=0;count1 < counter3;count1++){
                System.out.print(" *");
            }
            space-=1;
            counter2+=1;
            System.out.println(" ");
        }

        }
    }

