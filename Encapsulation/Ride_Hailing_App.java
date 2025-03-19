package week2_assignment4;

import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle1 implements GPS {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;
    private String currentLocation;

    public Vehicle1(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Unknown";
    }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate: " + ratePerKm;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

class Cars extends Vehicle1 {
    public Cars(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }
}

class Bikes extends Vehicle1 {
    public Bikes(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance * 0.9;
    }
}

class Auto extends Vehicle1 {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance * 1.1;
    }
}

public class RideHailingApp {
    public static void main(String[] args) {
        List<Vehicle1> rides = new ArrayList<>();
        rides.add(new Cars("V101", "John Doe", 15));
        rides.add(new Bikes("V102", "Jane Smith", 10));
        rides.add(new Auto("V103", "Alex Brown", 12));

        for (Vehicle1 ride : rides) {
            System.out.println(ride.getVehicleDetails());
            System.out.println("Total Fare for 10 km: " + ride.calculateFare(10));
            ride.updateLocation("City Center");
            System.out.println("Current Location: " + ride.getCurrentLocation());
            System.out.println("-----------------------------");
        }
    }
}
