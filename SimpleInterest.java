import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter the interest rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter the time period: ");
        double t = sc.nextDouble();
        double si = (p * t * r) / 100;
        System.out.println("The interest is " + si);

        sc.close();
    }
}
