public class C1_8_AreaAndPerimeterOfACircle {
    public static void main(String[] args) {
        double radius = 5.5;
        double pi = 3.141592653589793;

        double perimeter = 2 * radius * pi;
        double area = radius * radius * pi;

        System.out.println("Perimeter of the circle is " + perimeter);
        System.out.println("Area of the circle is " + area);
    }   
}