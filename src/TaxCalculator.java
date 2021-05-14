import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args){
        Scanner scrn = new Scanner(System.in);
        double income, totalTax=0, tax = 0, tax2=9700*0.1, tax3=(39475-9700)*0.12,
                tax4=(84200-39475)*0.22, tax5=(160725-84200)*0.24, tax6= (204100-160725)*0.32, tax7=(510300-204100)*0.35;
        System.out.print("What was your 2019 income?");
        income = scrn.nextDouble();
        if(income <= 9700){
            tax = 0.1*income;
            System.out.println("First $9700: " + tax);
            totalTax = totalTax + tax;
        }else if(income > 9700 && income < 39475){
            System.out.println("First $9700: " + tax2);
            tax2 = 0.12*(income - 9700);
            System.out.println("$9700 - $39475: " + tax);
            totalTax = tax + tax2;
        }else if(income > 39475 && income < 84200) {
            System.out.println("First $9700: " + tax2);
            System.out.println("9700 - $39475: " + tax3);
            System.out.println("$39475 - 84200: " + tax);
            tax3 = (0.22 * (income - 39475));
            totalTax = tax + tax2 + tax3;
        }else if(income >84200 && income < 160725){
            System.out.println("First $9700: " + tax2);
            System.out.println("9700 - $39475: " + tax3);
            System.out.println("$39475 - 84200: " + tax4);
            //System.out.println("$84200 - $160725: " + tax);
            tax = (0.24*(income - 84200));
            System.out.println("$84200 - $160725: " + tax);
            totalTax = tax + tax2 + tax3 + tax4;
            //System.out.println("$84200 - $160725: " + tax);
        }else if(income > 160725 && income < 204100){
            System.out.println("First $9700: " + tax2);
            System.out.println("9700 - $39475: " + tax3);
            System.out.println("$39475 - 84200: " + tax4);
            System.out.println("$84200 - $160725: " + tax5);
            System.out.println("160725 - 204100: " + tax);
            tax = (0.32 * (income - 160725));
            totalTax = tax + tax2 + tax3 + tax4 + tax5;
        }else if(income > 204100 && income < 510300){
            System.out.println("First $9700: " + tax2);
            System.out.println("9700 - $39475: " + tax3);
            System.out.println("$39475 - 84200: " + tax4);
            System.out.println("$84200 - $160725: " + tax5);
            System.out.println("160725 - 204100: " + tax6);
            System.out.println("204100 - 510300: " + tax);
            tax = (0.35*(income - 204100));
            totalTax = tax + tax2 + tax3 + tax4 + tax5 + tax6;
        }else{
            System.out.println("First $9700: $" + tax2);
            System.out.println("9700 - $39475: $" + tax3);
            System.out.println("$39475 - 84200: $" + tax4);
            System.out.println("$84200 - $160725: $" + tax5);
            System.out.println("160725 - 204100: $" + tax6);
            System.out.println("204100 - 510300: $" + tax7);
            //System.out.println("");
            tax = (0.37*(income - 510300));
            totalTax = tax + tax2 + tax3 + tax4 + tax5 + tax6 + tax7;
        }

        System.out.println("Total tax owed: $" + totalTax);
        System.out.println("Effective tax rate: " + totalTax*.001 + "%");
    }
}
