import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        double num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        double result;
        result = num1 * num2;
        System.out.println("The result is " + result);

        sc.close();
    }
}
