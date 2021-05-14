import java.util.Scanner;

public class ISBNChecker {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        long ISBN;
        System.out.print("Enter 13-digit ISBN: ");
        ISBN = scrn.nextLong();
        if(ISBN >= 9999999999999L){
            System.out.println("Error - number exceeds 13 digits");
        }
        else{
            ISBN = ISBN/10;
            long ISBN1 = (ISBN%10);//1
            ISBN = ISBN/10;
            long ISBN2 = (ISBN1%10);//2
            ISBN = ISBN/10;
            long ISBN3 = (ISBN2%10);//3
            ISBN = ISBN/10;
            long ISBN4 = (ISBN3%10);//4
            ISBN = ISBN/10;
            long ISBN5 = (ISBN4%10);//5
            ISBN = ISBN/10;
            long ISBN6 = (ISBN5%10);//6
            ISBN = ISBN/10;
            long ISBN7 = (ISBN6%10);//7
            ISBN = ISBN/10;
            long ISBN8 = (ISBN7%10);//8
            ISBN = ISBN/10;
            long ISBN9 = (ISBN8%10);//9
            ISBN = ISBN/10;
            long ISBN10 = (ISBN9%10);//10
            ISBN = ISBN/10;
            long ISBN11 = (ISBN10%10);//11
            ISBN = ISBN/10;
            long ISBN12= (ISBN11%10);//12
            ISBN = ISBN/10;
            long ISBN13 = (ISBN12%10);//13
            //ISBN = ISBN/10;
            long TotalISBN = ((ISBN1 + (3*ISBN2) + ISBN3 + (3*ISBN4) + ISBN5 + (3*ISBN6) + ISBN7 + (3*ISBN8) + ISBN9 +(3*ISBN10)
                    + ISBN11 + (3*ISBN12) + ISBN13)) % 10;
            if(TotalISBN == 0){
                System.out.println("Number is invalid!");
            }else{
                System.out.println("Number is valid!");
            }
        }

    }
}
