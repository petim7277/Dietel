package Assignments;

import java.util.Scanner;

public class NokiaMobile {
    Scanner keyboardInput = new Scanner(System.in);

    public void print (String word){
        System.out.println(word);
    }

    void menu(){
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
        System.out.println("Enter a number to select your option: ");
        int option = keyboardInput.nextInt();
        switch (option){
            case 1: phoneBook();
            case 2: messages();
            case 3: chat();
            case 4: callRegister();
            case 5: Tones();
            case 6: settings();
            case 7: callDivert();
            case 8: Games();
            case 9: calculator();
            case 10: reminders();
            case 11: clock();
            case 12: profiles();
            case 13: simServices();
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
        System.out.println("Enter a number: ");
        int userInput = keyboardInput.nextInt();
        if (userInput == 1){
            phonebookSearch();
        }
        if (userInput == 8 ){
            phonebookOptions();
        }
        }

    public void  phonebookSearch (){
        print("Search");
    }
    public void phonebookOptions (){
        print("""
                1. Type of view
                2. Memory status              \s
                """);
    }
    public void messages(){
     print("""
             1. Write messages
             2. Inbox
             3. Outbox
             4. Picture messages
             5. Templates
             6. Smileys
             7. Message settings
             8. Info service
             9. Voice mailbox number
             10.Service command editor
                              """);
        int option = keyboardInput.nextInt();
        if (option == 7){
         setOne();
         setTwo();
        }
    }

    private void setTwo() {
        print("""
                    2. Common 3
                    1. Delivery reports
                    2. Reply via same centre
                    3. Character support
                    """);
    }

    private void setOne() {
        print("""
                    1.Set1
                    1. Message centre number
                    2. Messages sent as
                    3. Message validity
                    """);   
    }
    private void chat() {
        
    }
    private void callRegister() {
        print("""
                1. Missed calls
                2. Received calls
                3. Dialled numbers
                4. Erase recent call lists
                5. Show call duration
                6. Show call cost
                7. Call cost settings
                8. Prepaid credit
                
                """);
        print("Enter a number: ");
        int userInput = keyboardInput.nextInt();
        if (userInput == 5){
            print("""
                    1. Last call duration
                    2. All calls’ duration
                    3. Received calls’ duration
                    4. Dialled calls’ duration
                    5. Clear timers
                    """);
        }
        if (userInput == 6){
            print("""
                    1. Last call cost
                    2. All calls’ cost
                    3. Clear counters
                    """);
        }
        if (userInput == 7){
            print("""
                    1. Call cost limit
                    2. Show costs in
                    """);
        }
    }
    private void Tones() {
        print("""
                1. Ringing tone
                2. Ringing volume
                3. Incoming call alert
                4. Composer
                5. Message alert tone
                6. Keypad tones
                7. Warning and game tones
                8. Vibrating alert
                9. Screen saver
                """);
    }
    private  void settings(){
        print("""
              1. Call settings
              2. Phone settings
              3. Security settings
              4. Restore factory settings
               
              """);
        System.out.println("Enter a number: ");
        int userInput = keyboardInput.nextInt();
        if (userInput == 1){
            print("""
                    1. Automatic redial
                    2. Speed dialling
                    3. Call waiting options
                    4. Own number sending
                    5. Phone line in use
                    6. Automatic answer
                    """);
        }
        if (userInput == 2){
            print("""
                    1. Language
                    2. Cell info display
                    3. Welcome note
                    4. Network selection
                    5. Lights2
                    6. Confirm SIM service actions
                    """);
        }
        if (userInput == 3){
            print("""
                    1. PIN code request
                    2. Call barring service
                    3. Fixed dialling
                    4. Closed user group
                    5. Phone security
                    6. Change access codes
                    """);
        }

    }
    private  void callDivert(){

    }
    private  void Games(){

    }
    private  void calculator(){

    }
    private  void reminders(){

    }
    private  void clock(){
      print("""
              1. Alarm clock
              2. Clock settings
              3. Date setting
              4. Stopwatch
              5. Countdown timer
              6. Auto update of date and time
              """);
    }
    private  void profiles(){

    }
    private  void simServices(){

    }


}
