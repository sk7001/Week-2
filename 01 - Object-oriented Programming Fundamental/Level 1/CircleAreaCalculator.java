import java.util.Scanner;
class Circle {
    int radius;
    Circle(int radius) {
        this.radius = radius;
    }
    void displayArea() {
        System.out.format("Area of circle for %d is %.2f", radius, Math.PI * Math.pow(radius, 2));
    }
}
public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius of circle:");
        int radius = scanner.nextInt();
        Circle circle = new Circle(radius);
        circle.displayArea();
    }
}
