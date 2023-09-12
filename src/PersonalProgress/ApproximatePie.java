package PersonalProgress;

public class ApproximatePie {
    public static void main(String[] args) {
      double pie = 1.0 *(1- 1/ 3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)  ;
        System.out.printf("The pie is : %f",pie);

        System.out.println("        ");
        double secondPie = 1.0 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 );
        System.out.printf("The second pie is : %f",secondPie);
    }
}
