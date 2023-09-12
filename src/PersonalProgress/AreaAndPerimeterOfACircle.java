package PersonalProgress;

public class AreaAndPerimeterOfACircle {
    public static void main(String[] args) {
        double radius = 5.5 ;
        double pie = 3.14285 ;
        double perimeter = 2 * radius * pie ;
        System.out.printf("The perimeter is: %f",perimeter);

        System.out.println("        ");
        double area = radius * radius * pie;
        System.out.printf("The area of a circle is: %f",area);
    }
}
