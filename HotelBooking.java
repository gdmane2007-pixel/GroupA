
import java.util.Scanner;

public class HotelBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // object of the scanner class

        int rooms[][] = new int[3][4];  // 2 dimensional array 
        int choice, floor, room;

        do {
            System.out.println(" hotel management system ");
            System.out.println("1. View Rooms , 2. Book Room, 3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Room Status:");

                    for (int i = 0; i < 3; i++) {
                        System.out.print("Floor " + (i + 1));

                        for (int j = 0; j < 4; j++) {
                            if (rooms[i][j] == 0) {
                                System.out.print("Available ");
                            } else {
                                System.out.print("Booked ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Enter floor (1-3):-");
                    floor = sc.nextInt();

                    System.out.print("Enter room number (1-4):- ");
                    room = sc.nextInt();

                    if (floor >= 1 && floor <= 3 &&
                        room >= 1 && room <= 4) {

                        if (rooms[floor - 1][room - 1] == 0) {
                            rooms[floor - 1][room - 1] = 1;
                            System.out.println("Room booked successfully!");
                        } else {
                            System.out.println("Room is already booked");
                        }

                    } else {
                        System.out.println("Invalid floor or room number");
                    }
                    break;

                case 3:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 3);

        sc.close();
    }
}
