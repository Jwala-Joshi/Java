import java.util.Scanner;

public class AddBinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary1, binary2;
        int[] sum = new int[10];
        int i=0, remainder =0;
        System.out.print("Enter the binary numbers: ");
        binary1 = sc.nextInt();
        binary2 = sc.nextInt();
        while(binary1 !=0 || binary2 !=0){
            sum[i++] = (binary1 + binary2 + remainder) % 2;
            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
            binary1 /= 10;
            binary2 /= 10;
        }
        if(remainder != 0){
            sum[i++] = remainder;
        }
        --i;
        while(i>=0) {
            System.out.print(sum[i--]);
        }

        sc.close();
    }
}
