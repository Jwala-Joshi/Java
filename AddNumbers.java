import java.util.Scanner;

class AddNumbers {
    public static void main(String[] args){
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);

        sc.close();
    }
}