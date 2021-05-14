import java.util.Scanner;
public class OccupancyRate {
    public static void main(String[] args){
        Scanner scrn = new Scanner(System.in);
        int floor;
        int room;
        int totalRoom = 0;
        int occupied;
        double totalOccupied = 0;
        double VacantRoom;
        double OccupancyRate;
        System.out.print("How many floors does the hotel have?");
        floor = scrn.nextInt();
        while (floor < 1){
            System.out.print("Invalid, Enter 1 or more: ");
            floor = scrn.nextInt();
        }
        int i = 0;
        while(i < floor){
            System.out.print("How many rooms does the floor " + (i + 1) + " have?");
            room = scrn.nextInt();
            while (room < 10){
                System.out.print("Invalid, Enter 10 or more: ");
                room = scrn.nextInt();
            }
            totalRoom += room;
            System.out.print("How many occupied rooms does the floor " + (i + 1) + " have?");
            occupied = scrn.nextInt();

            while(occupied > room){
                System.out.print("Invalid. Must be " + room + " or less. Re-enter:");
                occupied = scrn.nextInt();
            }
            totalOccupied += occupied;
            i++;
        }
        OccupancyRate = (totalOccupied/totalRoom) * 100;
        VacantRoom = (int) totalRoom - totalOccupied;
        System.out.println("Number of room: " + totalRoom);
        System.out.println("Occupied rooms: " + totalOccupied);
        System.out.println("Vacant room: " + VacantRoom);
        System.out.println("Occupancy rate: " + OccupancyRate + " %");
    }
}
