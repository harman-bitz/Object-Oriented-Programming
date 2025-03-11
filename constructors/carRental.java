import java.util.Scanner;
class Car{
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double pricePerDay;

    // constructor
    Car(String customerName, String carModel, int rentalDays,double pricePerDay){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.pricePerDay = pricePerDay;
    }

    // method to calculate price

    double calculatePrice(double pricePerDay, int rentalDays ){
        return pricePerDay*rentalDays;
    }

    // to disply results
    void diplayResults(){
        System.out.println("Total cost for renting "+carModel+" for "+rentalDays+" days will be "+ calculatePrice(pricePerDay, rentalDays));
    }



}
public class carRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Nmae ");
        String customerName = sc.nextLine();
        System.out.println("Enter car model you want to rent ");
        String carModel = sc.nextLine();
        System.out.println("Enter Number of days you want to rent ");
        int rentalDays = sc.nextInt();
        int pricePerDay = 1000;
        Car car = new Car(customerName, carModel, rentalDays, pricePerDay);
        car.diplayResults();
    }
}
