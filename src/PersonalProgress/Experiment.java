package PersonalProgress;

public class Experiment {
    public static String importantZero(int negativeNumbers, int positiveNumbers, int zeroS){
      return String.format("""
                           negative numbers : %d
                           positive numbers : %d
                           Zeros: %d
                           """,positiveNumbers,negativeNumbers,zeroS);
    }

}
