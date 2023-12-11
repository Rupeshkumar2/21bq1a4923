import java.util.Scanner;

public class N_primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start= sc.nextInt();
        int end= sc.nextInt();
        for (int i = start; i <= end; i++) {
            if(primes(i))
                System.out.print(i+" ");
        }
    }

    static boolean primes(int num){
        if(num<=1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if(num%i==0)
                return false;
        return true;
    }
}
