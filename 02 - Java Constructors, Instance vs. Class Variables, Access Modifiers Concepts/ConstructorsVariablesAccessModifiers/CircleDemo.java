import java.util.Scanner;
class Circle{
   int radius;
   Circle(){
       this(5);
   }
   Circle(int radius){
       this.radius = radius;
   }
   int display(){
       return (radius);
   }
   double displayCircumference(){
       return (2*Math.PI*radius);
   }
   double displayArea(){
       return (Math.PI*(double)Math.pow(radius,2));
   }
}
public class CircleDemo {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Default chained constructor");
       Circle circle = new Circle();
       System.out.println("Radius is " + circle.display());
       System.out.println("Circumference is " + circle.displayCircumference());
       System.out.println("Area is " + circle.displayArea());
       System.out.println();
       System.out.println("Parameterised chain constructor");
       System.out.println("Please enter the radius");
       int radius = scanner.nextInt();
       Circle circle1 = new Circle(radius);
       System.out.println("Radius is " + circle1.display());
       System.out.println("Circumference is " + circle1.displayCircumference());
       System.out.println("Area is " + circle1.displayArea());
   }
}
