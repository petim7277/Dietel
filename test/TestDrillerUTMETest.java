import Assignments.TestDrillerUTME;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDrillerUTMETest {
    @Test
    public void testThatDrillerUtmeExistTest(){
        TestDrillerUTME driller = new TestDrillerUTME();
        assertTrue(true);
    }
    @Test
    public void forOneToFourCopiesTest(){
        TestDrillerUTME driller = new TestDrillerUTME();
            driller.oneToFourCopies(4);
                System.out.printf("Price per copy or copies for book is: %d",driller.oneToFourCopies(4));
                    assertEquals(2000,driller.oneToFourCopies(4));

    }
    @Test
    public void forFiveToNineCopiesTest(){
        TestDrillerUTME driller = new TestDrillerUTME();
            driller.fiveToNineCopies(5);
                System.out.printf("Price per copy or copies for book is: %d",driller.fiveToNineCopies(5));
                    assertEquals(1800,driller.fiveToNineCopies(5));

    }

    @Test
    public void forTenToTwentyNineCopiesTest(){
        TestDrillerUTME driller = new TestDrillerUTME();
             driller.tenToTwentyNineCopies(15);
                 System.out.printf("Price per copy or copies for book is: %d",driller.tenToTwentyNineCopies(15));
                     assertEquals(1600,driller.tenToTwentyNineCopies(15));

    }
    @Test
    public void forThirtyToFortyNineCopiesTest(){
        TestDrillerUTME driller = new TestDrillerUTME();
            driller.ThirtyToFortyNineCopies(35);
                System.out.printf("Price per copy or copies for book is: %d",driller.ThirtyToFortyNineCopies(35));
                     assertEquals(1500,driller.ThirtyToFortyNineCopies(35));

    }

    @Test
    public void forFiftyToNinetyNineCopiesTest(){
        TestDrillerUTME driller = new TestDrillerUTME();
            driller.FiftyToNinetyNineCopies(60);
                System.out.printf("Price per copy or copies for book is: %d",driller.FiftyToNinetyNineCopies(60));
                    assertEquals(1300,driller.FiftyToNinetyNineCopies(60));

    }

    @Test
    public void forHundredToAHundredAndNinetyNineCopiesTest(){
        TestDrillerUTME driller = new TestDrillerUTME();
            driller.HundredToAHundredAndNinetyNineCopies(100);
                System.out.printf("Price per copy or copies for book is: %d",driller.HundredToAHundredAndNinetyNineCopies(100));
                    assertEquals(1200,driller.HundredToAHundredAndNinetyNineCopies(100));

    }

    @Test
    public void forFiveHundredCopiesAndAboveTest(){
        TestDrillerUTME driller = new TestDrillerUTME();
            driller.fiveHundredCopiesAndAbove(580);
               System.out.printf("Price per copy or copies for book is: %d",driller.fiveHundredCopiesAndAbove(580));
                  assertEquals(1000,driller.fiveHundredCopiesAndAbove(580));

    }

}
