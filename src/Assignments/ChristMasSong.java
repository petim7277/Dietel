package Assignments;

import java.util.Scanner;

public class ChristMasSong {
    public void print(String keyword){
        System.out.println(keyword);
    }
    public static void main(String[] args) {
        ChristMasSong christMasSong = new ChristMasSong();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers from one to twelve to print a particular verse in the song 12 days of christmas : ");
       int user_input=input.nextInt();
        int user_input2=input.nextInt();
        System.out.println("Enter  numbers from 11 to 22 to print remaining verses in the verse slected :");
        switch (user_input){
        case 1:
            System.out.println("""
        On The First Day Of Christmas
        My True Love Sent To Me
              """);
        case 2:
            System.out.println("""
        On The Second Day Of Christmas
        My True Love Sent To Me
              """);
        case 3:
            System.out.println("""
        n The Third Day Of Christmas
        My True Love Sent To Me
              """);
        case 4:
            System.out.println("""
        On The Fourth Day Of Christmas
        My True Love Sent To Me
              """);
        case 5:
            System.out.println("""
        On The Fifth Day Of Christmas
        My True Love Sent To Me
              """);
        case 6:
            System.out.println("""
        On The sixth Day Of Christmas
        My True Love Sent To Me
              """);
        case 7:
            System.out.println("""
        On The Sixth Day Of Christmas
        My True Love Sent To Me
              """);
        case 8:
            System.out.println("""
        On The eighth Day Of Christmas
        My True Love Sent To Me
              """);
        case 9:
            System.out.println("""
           On The ninth Day Of Christmas
           My True Love Sent To Me
                 """);
        case 10:
            System.out.println("""
           On The eighth Day Of Christmas
           My True Love Sent To Me
                 """);
        case 11:
            System.out.println("""
           On The eleventh Day Of Christmas
           My True Love Sent To Me
                 """);
        case 12:
            System.out.println("""
           On The twelveth Day Of Christmas
           My True Love Sent To Me
                 """);
        }
        switch (user_input){
        case 11:
            System.out.println("""
          A Partridge In A Pear Tree
                """);
        case 12:
            System.out.println("""
            Two Turtle Doves
            And A Partridge In A Pear Tree
                  """);
        case 13:
            System.out.println("""
            Three French Hens
            Two Turtle Doves
            And A Partridge In A Pear Tree
                  """);
        case 14:
        christMasSong.print("""
          Four Calling Birds
          Three French Hens
          Two Turtle Doves
          And A Partridge In A Pear Tree
                """);
        case 15:
     christMasSong.print("""
          Five Golden Rings
          Four Calling Birds
          Three French Hens
          Two Turtle Doves
          And A Partridge In A Pear Tree
                """);
        case 16:
    christMasSong.print("""
           Six Geese A Laying
           Five Golden Rings
           Four Calling Birds
           Three French Hens
           Two Turtle Doves
           And A Partridge In A Pear Tree
                 """);
        case 17:
    christMasSong.print("""
            Seven Swans A Swimming
            Six Geese A Laying
            Five Golden Rings
            Four Calling Birds
            Three French Hens
            Two Turtle Doves
            And A Partridge In A Pear Tree
                  """);
        case 18:
       christMasSong.print("""
            On The Eighth Day Of Christmas
            My True Love Sent To Me:
            Eight Maids A Milking
            Seven Swans A Swimming
            Six Geese A Laying
            Five Golden Rings
            Four Calling Birds
            Three French Hens
            Two Turtle Doves
            And A Partridge In A Pear Tree
                  """);
        case 19:
        christMasSong.print("""
            Nine Ladies Dancing
            Eight Maids A Milking
            Seven Swans A Swimming
            Six Geese A Laying
            Five Golden Rings
            Four Calling Birds
            Three French Hens
            Two Turtle Doves
            And A Partridge In A Pear Tree
                  """);
        case 20:
        christMasSong.print("""
            Ten Lords A Leaping
            Nine Ladies Dancing
            Eight Maids A Milking
            Seven Swans A Swimming
            Six Geese A Laying
            Five Golden Rings
            Four Calling Birds
            Three French Hens
            Two Turtle Doves
            And A Partridge In A Pear Tree
                  """);
        case 21:
        christMasSong.print("""
            Eleven Pipers Piping
            Ten Lords A Leaping
            Nine Ladies Dancing
            Eight Maids A Milking
            Seven Swans A Swimming
            Six Geese A Laying
            Five Golden Rings
            Four Calling Birds
            Three French Hens
            Two Turtle Doves
            And A Partridge In A Pear Tree
                  """);
        case 22:
        christMasSong.print("""
            12 Drummers Drumming
            Eleven Pipers Piping
            Ten Lords A Leaping
            Nine Ladies Dancing
            Eight Maids A Milking
            Seven Swans A Swimming
            Six Geese A Laying
            Five Golden Rings
            Four Calling Birds
            Three French Hens
            Two Turtle Doves
            And A Partridge In A Pear Tree
                  """);
        }


    }
    }

