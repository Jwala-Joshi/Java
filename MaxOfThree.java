public class MaxOfThree {
    public static void main(String[] args) {
        int num1 = 12,num2 = 32, num3 = 53, max;
        max = (num1 > num2) ? ((num1> num3) ? num1 : num3 ) : ((num2 > num3 ) ? num2 : num3 );
        System.out.println(max);
    }
}
