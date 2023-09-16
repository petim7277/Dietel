package chapterFour;

public class ExerciseThree {
    public void print(String word){
        System.out.println(word);
    }
  public void print(int word){
        System.out.println(word);
    }

    public static void main(String[] args) {
        int  variableY = 0;
     variableY = variableY+1;
        variableY =  variableY++;
        variableY +=1;
      ExerciseThree myExercise = new ExerciseThree();
      myExercise.print( variableY);

    }
}
