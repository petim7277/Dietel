package Assignments;

public class BackToSenderLogistics {
    //Base pay
   private static int basePay  = 5000;
    //Amount per parcel
   private    int firstAmount = 160;
   private   int secondAmount = 200;
   private   int thirdAmount = 250;
   public static int fourthAmount = 500;


    public int riderDailyWageForFiftyPercent(int numberOfSuccessfulDeliveriesMade) {
        int result=0;
        if (numberOfSuccessfulDeliveriesMade > 0 && numberOfSuccessfulDeliveriesMade < 50) {
            result = numberOfSuccessfulDeliveriesMade * firstAmount + basePay;
        }
        return result;
    }



    public int riderDailyWageForFiftyToFiftyNinePercent(int numberOfDeliveries) {
        int resultTwo=0;
        if (numberOfDeliveries >49  && numberOfDeliveries < 60) {
            resultTwo = numberOfDeliveries * secondAmount + basePay;
        }
        return resultTwo;
    }



    public int riderDailyWageForSixtyToSixtyNinePercent(int  numberOfSuccessfulDeliveries) {
        int resultThree=0;
        if (numberOfSuccessfulDeliveries >59  && numberOfSuccessfulDeliveries < 70) {
            resultThree = numberOfSuccessfulDeliveries * thirdAmount + basePay;
        }
        return resultThree;
    }


    public static int riderDailyWageForLessThanEqualToSeventyPercent(int numberOfDeliveries) {
        int resultFour=0;
        if (numberOfDeliveries <= 70) {
            resultFour = numberOfDeliveries * fourthAmount + basePay;
        }
        return resultFour;
    }


}























