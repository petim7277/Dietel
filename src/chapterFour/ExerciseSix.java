package chapterFour;

public class ExerciseSix {
    public static void main(String[] args) {
   int count = 0;
   int sum = 0;
   while (count <10){
       ++count;
       sum = sum + count;
   }
        System.out.println(count);
        System.out.print("Sum of numbers ranging from 1-10 is ="+ sum);
    }
}
