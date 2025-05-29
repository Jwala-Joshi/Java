import java.util.Scanner;

class Complex {
    double real,imaginary;
    void setValue(double r, double i){
        this.real = r;
        this.imaginary = i;
    }    
    public static Complex add(Complex c1,Complex c2){
        Complex temp = new Complex();
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }
    public void getValue(){
        System.out.println(real + " + "+ imaginary + "i");
    }
}

public class AddComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complex c1 = new Complex(), c2 = new Complex();
        System.out.print("Enter the Complex numbers: ");
        c1.setValue(sc.nextDouble(),sc.nextDouble());
        c2.setValue(sc.nextDouble(),sc.nextDouble());
        Complex tem = Complex.add(c1, c2);
        System.out.print("Sum = ");
        tem.getValue();
        
        sc.close();
    }
}
