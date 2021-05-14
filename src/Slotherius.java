import java.lang.Math;
import java.util.Scanner;

public class Slotherius {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Slotherius Used Triple Claw Slash!");
        System.out.print("How many seconds would you like to charge?");
        int number= scan.nextInt();
        int attack = 50 - (20*number);
        int attack2 = 50 + (21*number);
        int damage = (int) Math.floor(Math.random()*(35-24+1)+24);// attack 1 and 2
        int damage3 = (int) Math.floor(Math.random()*(attack2-attack+1)+attack); //attack 3
        System.out.println("Damage Dealt:");
        System.out.println("Attack 1: " + damage);
        System.out.println("Attack 2: " + damage);
        System.out.println("Attack 3: " + damage3);
    }
}
