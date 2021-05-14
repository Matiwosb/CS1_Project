import java.util.Scanner;

public class MonthlyPayments {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the following information: ");
        System.out.print("Initial amount of loan: ");
        //P, initial amount of loan (in dollars)
        final double InitalAmountOfLoan = scan.nextDouble();
        //r, monthly interest rate (as a decimal), which is the annual interest rate divided by 12
        System.out.print("Annual interest rate (in %): ");
        final double annualInterestRate = scan.nextDouble();
        System.out.print("Number of years: ");
        //n, number of months to make payments
        final double numberOfYears = scan.nextDouble();

        final double percentage = annualInterestRate / 100;
        final double rate = percentage / 12;
        final double year = numberOfYears * 12;
        final double plusRate = InitalAmountOfLoan * rate * Math.pow(1 + rate, year);
        final double part2 = Math.pow((1 + rate), year) - 1;
        final double monthlyPayment= plusRate/part2;
        final double totalPaid = monthlyPayment * year;
        final double interestPaid = totalPaid - InitalAmountOfLoan;

        System.out.println("Monthy payment: $" + monthlyPayment + "\n" +
                "Total paid:     $" + totalPaid + "\nInterest paid:  $" + interestPaid);

    }
}
