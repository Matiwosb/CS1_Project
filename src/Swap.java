import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int x;
        final int y;
        System.out.print("Enter value for x: ");
        x = scan.nextInt();
        System.out.print("Enter value for y: ");
        y = scan.nextInt();

        System.out.println("Before swap: x = " + x + ", y = " + y);
        System.out.println("After swap: x = " + y + ", y = " + x);
    }
}