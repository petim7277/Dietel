import Assignments.BackToSenderLogistics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BackToSenderLogisticsTest {
    @Test
    public void testBackToSenderLogisticsExistTest(){
        BackToSenderLogistics logistics = new BackToSenderLogistics();
        assertTrue(true);
    }
    @Test
    public void LessThanFiftyPercentTest(){
        BackToSenderLogistics logistics = new BackToSenderLogistics();
              logistics.riderDailyWageForFiftyPercent(25);
                  System.out.printf("Rider's wage for today is: %d",logistics.riderDailyWageForFiftyPercent(25));
                       assertEquals(9000,logistics.riderDailyWageForFiftyPercent(25));
    }
    @Test
    public  void FiftyToFiftyNineTest(){
        BackToSenderLogistics logistics = new BackToSenderLogistics();
              logistics.riderDailyWageForFiftyToFiftyNinePercent(59);
                  System.out.printf("Rider's wage for today is:%d",logistics.riderDailyWageForFiftyToFiftyNinePercent(59));
                      assertEquals(16800,logistics.riderDailyWageForFiftyToFiftyNinePercent(59));
    }
    @Test
    public  void sixtyToSixtyNinePercentTest(){
        BackToSenderLogistics logistics = new BackToSenderLogistics();
               logistics.riderDailyWageForSixtyToSixtyNinePercent(69);
                   System.out.printf("Rider's wage for today is: %d",logistics.riderDailyWageForSixtyToSixtyNinePercent(69));
                        assertEquals(22250,logistics.riderDailyWageForSixtyToSixtyNinePercent(69));



    }
    @Test
    public  void LessThanEqualToSeventyPercentTest(){
        BackToSenderLogistics logistics = new BackToSenderLogistics();
        logistics.riderDailyWageForLessThanEqualToSeventyPercent(69);
        System.out.printf("Rider's wage for today is: %d",logistics.riderDailyWageForLessThanEqualToSeventyPercent(69));
        assertEquals(39500,logistics.riderDailyWageForLessThanEqualToSeventyPercent(69));



    }
}
