import java.util.Scanner;

public class QuestionableMagicTrick {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            int number;
            int mulNumber = 2;
            int numb = 10;
            //numb += numb;

        System.out.println("You stand in the presence of the Magnificent Magic Mademoiselle Millicent." +
                "\nPrepare to be amazed!");
        System.out.print("Enter an integer: ");
        number = scan.nextInt();
        System.out.println("OK, watch this...\n" +
                "We’ll multiply by " + mulNumber + " and get " + mulNumber * number +
                "\nThen we'll add " + numb + " and get " + ((mulNumber * number) + numb) + "\n" +
                "Then we'll divide by " + mulNumber + " and get " + (mulNumber * number + numb) / mulNumber);
        System.out.println("Then we’ll subtract the original number and get... " + (((mulNumber * number + numb) / mulNumber
        ) - number) + ". Amazing!!!");
    }
}
