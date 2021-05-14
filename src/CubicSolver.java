import java.util.Scanner;

public class CubicSolver {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Cubic Equation Solver\nEnter your coefficients:");
        System.out.print("What is the value of p?");
        double p = scan.nextDouble();
        System.out.print("What is the value of q?");
        double q = scan.nextDouble();

        double x = Math.cbrt(-(q/2)+Math.sqrt(Math.pow(q, 2)/4)+(Math.pow(p,3)/27));
        double y = Math.cbrt(-(q/2)-Math.sqrt(Math.pow(q,2)/4)+(Math.pow(p,3)/27));
        double z = x + y;

        System.out.println("The solution x is " + z + ".");
    }
}
