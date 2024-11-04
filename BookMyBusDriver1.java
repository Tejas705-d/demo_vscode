import java.util.Arrays;
import java.util.Scanner;

class Bus {
    static String[] seats = new String[30];
    static final double ticketPrice = 2000;
    static String date = "29/10/2024 9:00pm";
    static String hault = "JM road Deccan Near QSPIIDERS";
    static String busNumber = "MH12AA1234";

    static {
        Arrays.fill(seats, "AVAIL");
    }

    public void displaySeats() {
        for (int i = 0; i < seats.length; i++) {
            System.out.println((i + 1) + " -> " + seats[i]);
        }
        System.out.println();
    }

    public void bookSeat(int seatNumber) {
        if (seatNumber >= 1 && seatNumber <= 30) {
            if (seats[seatNumber - 1].equals("AVAIL")) {
                seats[seatNumber - 1] = "BOOKED";
                displaySeats();
                payment();
            } else {
                System.out.println("SEAT OCCUPIED");
            }
        } else {
            System.out.println("WRONG SEAT NUMBER ENTERED");
        }
    }

    private void payment() {
        System.out.println("Payment Confirmed");
        System.out.println("Booking Number: " + busNumber);
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Date & Time: " + date);
        System.out.println("Hault: " + hault);

        Passenger copy = BookMyBusDriver.obj;
        System.out.println("Passenger Name: " + copy.getName());
        System.out.println("Passenger Gender: " + copy.getGender());
        System.out.println("Passenger Contact: " + copy.getContact());
        System.out.println("Passenger Boarding: " + copy.getBoarding());
        System.out.println("Passenger Destination: " + copy.getDest());

        System.out.println("HAPPY JOURNEY! GO HOME & HAPPY DIWALI");
    }
}

class Passenger {
    private String name;
    private String gender;
    private long contact;
    private String boarding;
    private String dest;

    public Passenger(String name, String gender, long contact, String boarding, String dest) {
        this.name = name;
        this.gender = gender;
        this.contact = contact;
        this.boarding = boarding;
        this.dest = dest;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String newGender) {
        this.gender = newGender;
    }

    public long getContact() {
        return this.contact;
    }

    public void setContact(long newContact) {
        this.contact = newContact;
    }

    public String getBoarding() {
        return this.boarding;
    }

    public void setBoarding(String newBoarding) {
        this.boarding = newBoarding;
    }

    public String getDest() {
        return this.dest;
    }

    public void setDest(String newDest) {
        this.dest = newDest;
    }
}

class BookMyBusDriver1 {
    static Passenger obj;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to BOOK MY BUS");

        while (true) {
            System.out.print("Passenger Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Contact: ");
            long contact = sc.nextLong();
            sc.nextLine(); // Consume the newline left by nextLong()

            System.out.print("Boarding Point: ");
            String boarding = sc.nextLine();

            System.out.print("Destination: ");
            String dest = sc.nextLine();

            obj = new Passenger(name, gender, contact, boarding, dest);

            Bus bus = new Bus();
            System.out.println();
            bus.displaySeats();
            System.out.print("Enter the seat number: ");
            int seatNumber = sc.nextInt();
            sc.nextLine(); // Consume the newline left by nextInt()
            bus.bookSeat(seatNumber);
        }
    }
}
