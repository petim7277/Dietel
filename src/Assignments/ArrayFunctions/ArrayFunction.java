    package Assignments.ArrayFunctions;

    public class ArrayFunction {
        public static int largestElementDeterminant(int[] elementOne) {

            int largest = 0;
            for (int count = 0; count < elementOne.length; count++) {
                if (elementOne[count] > largest) {
                    largest = elementOne[count];
                }
            }
            return largest;
        }

        public static int smallestElementDeterminant(int[] elementOne) {
            int smallest = elementOne[0];
            int larger = elementOne[0];
            int counter = 0;
            for (int count = 0; count < elementOne.length; count++) {
                counter++;
                if (elementOne[count] < larger) {
                    smallest = elementOne[count];

                }
            }
            return smallest;

        }

        public static int[] arrayListReverse(int[] lenList) {
            int[] reverse = new int[lenList.length];
            int counter = 0;
            for (int count = lenList.length - 1; count >= 0; count--) {
                reverse[counter] = lenList[count];
                counter++;
            }
            return reverse;
        }


        public static Object[] arrayStringListReverse(String[] lenLists) {
            String[] reverse = new String[lenLists.length];
            int counter = 0;
            for (int count = lenLists.length - 1; count >= 0; count--) {
                reverse[counter] = lenLists[count];
                counter++;
            }
            return reverse;
        }

        public static char[] arrayCharListReverse(char[] lenList) {
            int counter = 0;
            char[] reverse = new char[lenList.length];
            for (int count = lenList.length - 1; count >= 0; count--) {
                reverse[counter] = lenList[count];
                counter++;
            }
            return reverse;
        }

        public static boolean arrayListChecker(int[] userInput,int check) {
             
            for (int count = 0; count < userInput.length; count++) {
                if (check == userInput[count]) {
                    return true;
                }
            }
             return false;
        }

        public static int[] arrayListOddPositionCheck(int []input){
           int [] oddPosition = {0};
            for (int index = 0; index < input.length; index++) {
                  if (index % 2 !=0) oddPosition[0]  = oddPosition[0] + input[index];
            }
            System.out.println(oddPosition[0]);
                    return oddPosition;
            }



        public static String [] arrayListOddPositionCheckForStrings(String[] input) {
            String [] odd = {""};
            for (int index = 0; index < input.length; index++) {
               if (index % 2 == 1)  odd [0] = input[index];
            }
            System.out.println(odd[0]);
            return  odd ;
        }
        public static int [] arrayListEvenPositionChecker(int[] input){
         int [] even = {0};
            for (int index = 0; index < input.length; index++) {
              if (index % 2 == 0) even [0]= input[index];
            }
            System.out.println(even[0]);
            return even;
        }

       public static  int  arrayListUsingForLoopTotal(int[] input){
            int total = 0;

           for (int index = 0; index < input.length; index++) {
            total  = total  + input[index] ;
           }
           return total;
       }
       
       public static int arrayListUsingWhileLoopTotal(int[] input){
            int total = 0;
            int counter = 0 ;
            while (counter < input.length){
                total = total + input[counter];
                counter ++ ;
            }
           return total ;
       }

        public static int arrayListUsingDoWhileLoopTotal(int[] input){
            int total = 0;
            int counter = 0 ;

            do {
            }while (counter < input.length);
            total = total + input[counter];
                  counter ++ ;
            return total ;
        }

          public static String[] arrayListUsingPalindrome(String[]input){
            String [] reverse  = new String[input.length] ;
            int count  = 0;
              for (int index =input.length-1 ; index >= 0  ; index--) {
                 reverse[count] = input[index] ;
                 count ++ ;
              }
              System.out.println(reverse[0]);
             return reverse;
          }









    }