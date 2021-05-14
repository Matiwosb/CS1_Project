import java.util.Scanner;

public class WorkingForTheMan {
    public static void main(String[] args) {
    Scanner scrn = new Scanner(System.in);
    int grade;
    int step;

    System.out.print("Enter employee grade: ");
    grade = scrn.nextInt();
    //System.out.print("Enter employee step: ");
    //step = scrn.nextInt();

    switch (grade) {
        case 1:
            //input
            System.out.print("Enter employee step: ");
            step = scrn.nextInt();
            switch (step) {
                case 1:
                    System.out.println("Salary: $19543");
                    break;
                case 2:
                    System.out.println("Salary: $20198");
                    break;
                case 3:
                    System.out.println("Salary: $20848");
                    break;
                case 4:
                    System.out.println("Salary: $21494");
                    break;
                default:
                    System.out.println("Error - step must be between 1 and 4");
                    break;
            }
            break;
        case 2:
            //input step
            System.out.print("Enter employee step: ");
            step = scrn.nextInt();
            switch (step) {
                case 1:
                    System.out.println("Salary: $21974");
                    break;
                case 2:
                    System.out.println("Salary: $22497");
                    break;
                case 3:
                    System.out.println("Salary: $23225");
                    break;
                case 4:
                    System.out.println("Salary: $23840");
                    break;
                default:
                    System.out.println("Error - step must be between 1 and 4");
                    break;
            }
            break;
        case 3:
            //input step
            System.out.print("Enter employee step: ");
            step = scrn.nextInt();
            switch (step) {
                case 1:
                    System.out.println("Salary: $23976");
                    break;
                case 2:
                    System.out.println("Salary: $24775");
                    break;
                case 3:
                    System.out.println("Salary: $25574");
                    break;
                case 4:
                    System.out.println("Salary: $26373");
                    break;
                default:
                    System.out.println("Error - step must be between 1 and 4");
                    break;
            }
            break;
        //not input step
        default:
            System.out.println("Error - grade must be between 1 and 3");
            break;
    }
   }
}
