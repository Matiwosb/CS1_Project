import java.util.*;

public class UnixTimeConverter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Unix time: ");
        final int unixTime = scan.nextInt();

        final int days = unixTime/86400;
        final int inset = unixTime%86400;
        final int Hours = inset/3600;
        final int input = inset%3600;
        final int Minutes = input/60;
        final int second = input%60;

        System.out.println("That is "+ days + " days(s) " + Hours + "\nhour(s)");
        System.out.println(Minutes + " minute(s) "+second + " second(s) since\nmidnight on January 1, 1970.");
    }
}
