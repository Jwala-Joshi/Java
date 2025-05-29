import java.util.Scanner;

public class Factorial {
    static int factorial(int num){
        if(num <2) {
            return 1;
        }
        else {
            return num * factorial(num -1 );
        }

    }
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        System.out.println("The factorial of " + number + " is " + factorial(number));

        sc.close();
    }
}
