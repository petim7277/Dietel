package Assignments;

import org.junit.jupiter.api.Test;

class NokiaMobileTest {
    @Test
    public void testThatNokiaClassHasBeenCreatedTest(){
        NokiaMobile myNokia = new NokiaMobile();
    }
    @Test
    public void testThatICanAccessPhoneMenuTest(){
        NokiaMobile myNokia = new NokiaMobile();
      myNokia.menu();
    }

}