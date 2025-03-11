import java.util.Scanner;

class hotel{
    private String guestName;
    private String roomType;
    private int numberOfNights;

    // default constructor
    hotel(){
        guestName = "Himanshi";
        roomType = "5-Star";
        numberOfNights = 3; 
    }

    // parameterized constructor
    hotel(String guestName, String roomType, int numberOfNights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
    }

    // copy parameterized constructor
    hotel(hotel hotel1){
        this.guestName = hotel1.guestName;
        this.roomType = hotel1.roomType;
        this.numberOfNights = hotel1.numberOfNights;

    }
    // method to book hotel room 
    void booKHotel(){
        System.out.println("Name of the guest "+ guestName);
        System.out.println("Room type that the guest opted "+ roomType);
        System.out.println("Number of Nights guest booked room for  "+ numberOfNights);
        System.out.println("Congratulation !! Your room is booked for "+numberOfNights+" days");
    }

}
public class hotelBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Guest Name ");
        String guestName = sc.nextLine();
        System.out.println("Enter room type ");
        String roomType = sc.nextLine();
        System.out.println("Enter number of Nights ");
        int numberOfNights = sc.nextInt();
        hotel Hotelfinal1 = new hotel();
        hotel Hotelfinal2 = new hotel(guestName, roomType,numberOfNights);
        Hotelfinal1.booKHotel(); 
        Hotelfinal2.booKHotel();

    }
}
