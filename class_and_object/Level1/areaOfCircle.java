//Write a program to create a Circle class with an attribute radius. Add methods to calculate and display the area and circumference of the circle.
import java.util.*;
class Circle{
    private double radius;

    // constructor
    public Circle(double radius){
        this.radius = radius;
    }

    // method to calculate area 
    public double calculateArea(){
        return Math.PI*radius*radius;
    }

    // method to calculate circumference 
    public double calculateCircumference(){
        return 2*Math.PI*radius;
    }

    // method to display results
    public void displayResult(){
        System.out.println("Circumference of circle is "+ calculateCircumference());
        System.out.println("Area of circle is "+ calculateArea());
    }
}
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius ");
        double radius = sc.nextDouble();
        Circle Area = new Circle(radius);
        Area.displayResult();
    }
}
