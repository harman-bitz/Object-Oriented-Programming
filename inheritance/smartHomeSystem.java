class Device {
    String deviceId;
    String status;
    
    // Constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    
    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass: Thermostat (inherits from Device)
class Thermostat extends Device {
    double temperatureSetting;
    
    // Constructor
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Calling the superclass constructor
        this.temperatureSetting = temperatureSetting;
    }
    
    // Overriding displayStatus() to include thermostat details
    @Override
    public void displayStatus() {
        super.displayStatus(); // Call the superclass method
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class smartHomeSystem {

	public static void main(String[] args) {
		
 		
        Thermostat thermostat = new Thermostat("T1001", "Active", 22.5);
        
        // Displaying device status
        thermostat.displayStatus();

	}

}
