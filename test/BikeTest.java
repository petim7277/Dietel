import chapterTwoExercises.Bike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {
        @Test
    public void testThatIHaveABikeAndBikeIsOnTest(){
        Bike myBike = new Bike();
            myBike.switchOnOrOff();
            myBike.checkIson();
            System.out.print(myBike.checkIson());
            assertEquals(true,myBike.checkIson());
        }
        @Test
        public void testThatBikeIsOffTest(){
            Bike myBike = new Bike();
            myBike.switchOnOrOff();
            myBike.checkIson();
            System.out.print(myBike.checkIson());
            assertEquals(false,myBike.checkIson());
        }
        @Test
        public void testThatBikeCanAccelerateTest(){
            Bike myBike = new Bike();
           myBike.accelerateSpeed();
           myBike.accelerateSpeed();
           myBike.deccelerateSpeed();
           myBike.getSpeed();
            System.out.print( myBike.getSpeed());
            assertEquals(2,myBike.getSpeed());
        }



}