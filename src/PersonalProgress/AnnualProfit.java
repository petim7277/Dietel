package PersonalProgress;

public class AnnualProfit {
    public static void main(String[] args) {


       int principal =1000;
       double rate =0.07;
       int year1 = 10;
       int year2  = 20;
       int  year3 = 30;
       int one = 1;

     double amount1=principal *(one + rate) * year1;
     double amount2=principal*(one + rate )* year2;
     double  amount3=principal*(one + rate) * year3;
        System.out.printf("\nThe interest : %f",amount1);
        System.out.printf("\nThe interest : %f",amount2);
        System.out.printf("\nThe interest : %f",amount3);

    }

}
