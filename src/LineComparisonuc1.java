import java.util .*;

public class LineComparisonuc1
{


    public static double length;

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program!!");


        System.out.println("Enter Values for 1st line");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 = ");
        int x1 = scanner.nextInt();
        System.out.println("Enter x2 = ");
        int x2 = scanner.nextInt();
        System.out.println("Enter y1 = ");
        int y1 = scanner.nextInt();
        System.out.println("Enter y2 = ");
        int y2 = scanner.nextInt();
        scanner.close();
        double length = Math.sqrt(((x2-x1)*(x2-x1)))+((y2-y1)*(y2-y1));
        System.out.println("Length of line " +length);
    }
}