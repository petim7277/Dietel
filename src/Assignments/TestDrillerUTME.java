package Assignments;

public class TestDrillerUTME {
    int firstPrice = 2000;
    int secondPrice = 1800;
    int thirdPrice = 1600;
    int fourthPrice = 1500;
    int fifthPrice = 1300;
    int sixthPrice= 1200;
    int seventhPrice = 1100;
    int eightPrice = 1000;


    public int oneToFourCopies(int numberOfCopies){
        int  result = 0;
      if (numberOfCopies  >0 && numberOfCopies <=4) {
       int price =    numberOfCopies * firstPrice;
           result= price/numberOfCopies;
      }

        return result; 
    }
    public int fiveToNineCopies(int numberOfCopies){
        int  resultTwo = 0;
        if (numberOfCopies  >4 && numberOfCopies <=9) {
            int priceTwo =    numberOfCopies * secondPrice;
            resultTwo= priceTwo/numberOfCopies;
        }

        return resultTwo;
    }
    public int tenToTwentyNineCopies(int numberOfCopies){
        int  resultThird = 0;
        if (numberOfCopies  >9 && numberOfCopies <=29) {
            int priceThird =    numberOfCopies * thirdPrice;
            resultThird= priceThird/numberOfCopies;
        }
        return resultThird; }

    public int ThirtyToFortyNineCopies(int numberOfCopies){
        int  resultFourth = 0;
        if (numberOfCopies  >29 && numberOfCopies <=49) {
            int priceFourth =    numberOfCopies * fourthPrice;
            resultFourth= priceFourth /numberOfCopies;
        }
        return resultFourth;
    }

    public int FiftyToNinetyNineCopies(int numberOfCopies){
        int  resultFifth = 0;
        if (numberOfCopies  >59 && numberOfCopies <=99) {

            int priceFifth =    numberOfCopies * fifthPrice;
            resultFifth= priceFifth /numberOfCopies;
        }
        return resultFifth;
    }

    public int HundredToAHundredAndNinetyNineCopies (int numberOfCopies){
        int  resultSixth = 0;
        if (numberOfCopies  >99 && numberOfCopies <=199) {

            int priceSixth =    numberOfCopies * sixthPrice;
            resultSixth= priceSixth /numberOfCopies;
        }
        return resultSixth;
    }

    public int TwoHundredToFourHundredAndNinetyNineCopies (int numberOfCopies){
        int  resultSeventh = 0;
        if (numberOfCopies  >199 && numberOfCopies <=499) {

            int priceSeventh =    numberOfCopies * seventhPrice;
            resultSeventh= priceSeventh /numberOfCopies;
        }
        return resultSeventh;
    }

    public int fiveHundredCopiesAndAbove (int numberOfCopies){
        int  resultEighth = 0;
        if (numberOfCopies  >500) {

            int priceSeventh =    numberOfCopies * eightPrice;
            resultEighth= priceSeventh /numberOfCopies;
        }
        return resultEighth;
    }





    }

