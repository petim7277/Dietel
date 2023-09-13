/*package ChapterThreeExercises;

import java.util.Scanner;
public class ClockTest {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Clock myClock = new Clock();
     public Clock( int hours, int seconds, int minutes){
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
        System.out.print("Enter number of hours");
        int hour = input.nextInt();
        public void setHours ( int hours){
            if (hours > 23) {
                this.hours = 0;
            } else {
                this.hours = hours;

            }
        }

        System.out.print("Enter number of seconds");
        int second = input.nextInt();
        public void setSeconds ( int seconds){
            if (seconds > 23) {
                this.seconds = 0;
            } else {
                this.seconds = seconds;
            }
        }
        System.out.print("Enter number of minutes");
        public void setMinutes ( int minutes){
            if (minutes > 23) {
                this.minutes = 0;
            } else {
                this.minutes = minutes;
            }
        }
        public int getHours () {
            return hours;
        }

        public int getSeconds () {
            return seconds;
        }

        public int getMinutes () {
            return minutes;
        }

        System.out.printf("hours are:%d", myClock.getHours());
        System.out.printf("Seconds are:%d", myClock.getSeconds());
        System.out.printf("Minutes are:%d", myClock.getMinutes());


    }
}
*/