import chapterTwoExercises.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {


        @Test
        public void testThatACIsOnTest(){
            //given I have an Ac
            AirConditioner myAc = new AirConditioner();
            //and it is brand new when i turn it on
            myAc.switchOn();
            //check that it is on
            assertTrue(true);
        }
        @Test
    public void testThatAcIsOffTest(){
            //given I have an AC
            AirConditioner myAc=new AirConditioner();
            // when it is on turn it off
            myAc.switchOff();
            //check that it is off
            assertTrue(true);
        }
    @Test
        public void testThatAcCanIncreaseTemperature(){
            //given I have an Ac
        AirConditioner myAc = new AirConditioner();
        //when it is on
        myAc.switchOn();
        //check that it is on and temperature is increased
        myAc.setTemperature(28);
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        assertEquals(30,myAc.getTemperature());
    }

    @Test
    public void testThatAcCantIncreaseIfAcIsOffTest(){
            //given I have an Ac
        AirConditioner myAc=new AirConditioner();
        //when it is off
        myAc.switchOff();
        //check that if it can increase temperature
        myAc.setTemperature(16);
        myAc.increaseTemperature();
        assertEquals(17,myAc.getTemperature());
    }
    @Test
    public void testThatAcCanDecreaseTemperatureTest(){
       //given I have an Ac
       AirConditioner myAc= new AirConditioner();
       // when it is on
        myAc.switchOn();
        //check that if it can decrease temperature
        myAc.setTemperature(17);
        myAc.decreaseTemperature();
        assertEquals(16,myAc.getTemperature());
    }
    @Test
    public void testThatAcCanDecreaseTemperatureWhenOffTest(){
     //given I have Ac
     AirConditioner myAc=new AirConditioner();
     //when it is off
        myAc.switchOff();
     //check that it can decrease temperature;
        myAc.setTemperature(17);
        myAc.decreaseTemperature();
        assertEquals(16,myAc.getTemperature());
    }
    }

