package ClassWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatingAnAddFunctinTest {
    @Test
    public void testThatCreatingAddFunctionClassExist(){
        CreatingAnAddFunctin myfunction  = new CreatingAnAddFunctin();
    }
    @Test
    public void testThatAddFunctionWorksTest(){
        CreatingAnAddFunctin function  = new CreatingAnAddFunctin();
       function.sumDigits(234);
    }
}