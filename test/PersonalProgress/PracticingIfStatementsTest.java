package PersonalProgress;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticingIfStatementsTest {

    @Test
   public void testThatIHaveMyGradeAppTest() {
        PracticingIfStatements grader = new PracticingIfStatements();
    }
     @Test
    public void testFofGradeSixtyTest(){
         PracticingIfStatements grader = new PracticingIfStatements();

          assertEquals(67,grader.studentGrade(67));
     }


    
    
    
    
    
    
}