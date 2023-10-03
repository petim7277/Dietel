package PersonalProgress;

public class PositioningLoops {
    public static void main(String[] args) {
        for (int row = 1; row <=5; row++) {
            System.out.println();
            for (int column = 5; column >= row ; column--) {
                System.out.print("*");
            }
        }
    }
}
