import java.util.Scanner;

public class Sub_Product_and_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int product=1;

        for (;n>0;n/=10) {
            product*=n%10;
            sum+=n%10;
        }
        System.out.print(product-sum);
    }
}
