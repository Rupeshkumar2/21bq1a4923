import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        fact(num);
    }

    static void fact(int n){
        int factorial=1;
        if(n<=1)
            System.out.print(1);
        for (int i = 2; i <= n; i++) {
            factorial*=i;
        }System.out.print("facotial of "+n+"is "+factorial);
    }
}
