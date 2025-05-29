import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);   
        if(ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117 || 
            ch == 65 || ch == 69 || ch == 73 || ch == 79 || ch == 117-32 ){
                System.out.println(ch + " is a Vowel.");
        }
        else
            System.out.println(ch + " is a Consonant.");
        
        sc.close();
    }
}
