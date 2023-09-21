package ChapterThreeExercises;

public class CarApplicationTest {
    public static void main(String[] args) {
       CarApplication rangeRover = new CarApplication("RangeRover","2024",5.300000);
       CarApplication RollsRoyce = new CarApplication("RollsRoyce","2027",6.500000);
        System.out.println(rangeRover.getModel());
        System.out.println(rangeRover.getYear());
        System.out.println(rangeRover.getPrice());


    }
}
