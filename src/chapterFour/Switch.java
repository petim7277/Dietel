package chapterFour;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                press 
                1 ->  Pidgin
                2 ->  English
                3 ->  Yoruba
                4 ->  Igbo
                
                press the number wey you wan use for here
                Enter a number to select your choice
                Tẹ nọmba sii lati yan yiyan rẹ
                tinye nọmba ka ịhọrọ nhọrọ gị
                """);

        int userInput = input.nextInt();
        switch (userInput){
            case 1:
                System.out.print("Abeg wait make we for answer your request");
        }

        switch (userInput){
            case 2:
            System.out.print("Please wait while we process your request!");
        }


        switch (userInput){
            case 3:
            System.out.print("E kasan e duro  ki a yoju oro yin");
        }

        switch (userInput){
            case 4:
            System.out.print(" biko chere ka a na-ahazi arịrịọ gi");
        }







    }

}
