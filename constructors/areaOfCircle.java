import java.util.*;

import javax.sound.sampled.SourceDataLine;
class Circle{
    private double radius;

    // default constructor 
    Circle(){
        this(5.2); // calls parameterized constructor
    }

    // parameterized constructor 
    Circle(double radius){
        this.radius = radius;
    }

    // to calculate area 
     double calculateArea(double radius){
        return Math.PI*radius*radius;
    }

    // to display results 
     void displayresults(){
        System.out.println("Area of circle is "+ calculateArea(radius));
    }

}
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius ");
        double radius = sc.nextDouble();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(radius);
        circle1.displayresults();
        circle2.displayresults();
    }
   
}
