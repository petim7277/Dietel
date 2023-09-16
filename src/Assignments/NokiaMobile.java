package Assignments;

import java.util.Scanner;

public class NokiaMobile {
    Scanner keyboardInput = new Scanner(System.in);

    public void print (String word){
        System.out.println(word);
    }
    public  void print(int number){
        System.out.println(number);
    }
    public  void nokia(){
        print("""
                1. Phone book
                2. Messages
                3. Chat
                4. Call Register
                5. Tones
                6. Settings
                7. Call Divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                          """);
        int option = keyboardInput.nextInt();
        switch (option){
            case 1: phoneBook();
            case 2:
        }

    }
    public  void  phoneBook (){
        print("""
                1. Phone book
                        1. Search
                        2. Service Nos. 1
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b’card
                        8. Options
                        9. Speed dials
                        10. Voice tags
                        """);
        int option = keyboardInput.nextInt();
        switch (option){
            case 1: phonebookSearch();
            case  8: phonebookOptions();
            default: nokia();
        }



    }
    public void  phonebookSearch (){
        print("Search");
    }
    public void phonebookOptions (){
        print("""
                  1. Type of view
                  2. Memory status
               ->   press anything to go back to phonebook
                """);
        int option = keyboardInput.nextInt();
        if (option > 0) phoneBook();

    }
    public void placeholder(){}


    }
