package Assignments.ArrayFunctions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFunctionTest {
    @Test
    public void checkThatLargestDeterminantFunctionWorksTest() {
        int[] elementOne = {30, 20, 50,40};
        assertEquals(50, ArrayFunction.largestElementDeterminant(elementOne));
    }
    @Test
    public void checkThatSmallestDeterminantFunctionWorks(){
        int[] elementOne = {50,20,30,40,60,51,9,100,10000,2,50,1} ;
        assertEquals(1, ArrayFunction.smallestElementDeterminant(elementOne));
    }
    @Test
    public  void checkThatIntReverseFunctionWorksTest(){
        int [] lenList = {1,2,3,4,5,6,7,8,9,10};
        int [] reverse = {10,9,8,7,6,5,4,3,2,1};
        assertArrayEquals(reverse, ArrayFunction.arrayListReverse(lenList));  }

    @Test
    public void checkThatStringReverseFunctionWorksTest() {
     String [] lenList = {"Father","Mother","Son","Daughter"};
     String [] reverse = {"Daughter", "Son","Mother","Father"};
     assertArrayEquals(reverse, ArrayFunction.arrayStringListReverse(lenList));
    }
    @Test
    public void checkThatCharReverseFunctionWorksTest(){
        char[] lenList = {'1','2','3','4','5'};
        char[] reverse = {'5','4','3','2','1'};
        assertArrayEquals(reverse, ArrayFunction.arrayCharListReverse(lenList));
    }
    @Test
    public void checkThatFunctionThatChecksIfAnElementExistInAListWorksTest(){
     int [] userInput = {1,2,3,4,5} ;
     int check = 3;
     assertEquals(true,ArrayFunction.arrayListChecker(userInput,check));
    }
    @Test
    public void checkIfFunctionsThatChecksOddPositionsWorkTest(){
     int [] input = {10,20,30,45,50,} ;
     int[] oddPosition = {20,45};
     assertArrayEquals(oddPosition,ArrayFunction.arrayListOddPositionCheck(input));
    }
    
    @Test
    public void checkIfFunctionThatChecksOddPositionsForStringsTest(){
        String [] input  = {"do","re","mi","fa","so"};
        assertEquals("re,fa ",ArrayFunction.arrayListOddPositionCheckForStrings(input));
    }
    @Test
    public void checkIfFunctionThatCheckEvenPositionsWorksTest(){
        int [] input = {1,2,3,4,5};
        assertEquals(4,ArrayFunction.arrayListEvenPositionChecker(input) );
    }
    @Test
    public void checkIfFunctionThatSumsArrayListWorksTest(){
    int [] input = {1,2,3,4,5,6,7,8,9,10} ;
    assertEquals(55,ArrayFunction.arrayListUsingForLoopTotal(input));
    }


    @Test
    public void checkIfFunctionThatSumsArrayListWithWhileLoopWorksTest(){
        int [] input = {1,2,3,4,5,6,7,8,9,10} ;
        assertEquals(55,ArrayFunction.arrayListUsingWhileLoopTotal(input));
    }

    @Test
    public void checkIfFunctionThatSumsArrayListWithDoWhileLoopWorksTest(){
        int [] input = {1,2,3,4,5,6,7,8,9,10} ;
        assertEquals(55,ArrayFunction.arrayListUsingDoWhileLoopTotal(input));
    }
    @Test
    public void checkThatPalindromeFunctionWorksTest(){
        String[] input = {"m","a","d","a","m"};
        String[] reverse = {"m","a","d","a","m"};
        assertArrayEquals(reverse, ArrayFunction.arrayListUsingPalindrome(input));
    }
}
