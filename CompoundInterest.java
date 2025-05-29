import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        double amount,rate,time;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        amount = sc.nextDouble();
        System.out.print("Enter the rate: ");
        rate = sc.nextDouble();
        System.out.print("Enter the time period: ");
        time = sc.nextDouble();
        System.out.print("The Compound Interest of "+ amount + " is " );
        System.out.printf("%.2f",+ (amount * Math.pow(1 + rate/100,time)- amount ));

        sc.close();
    }
}
