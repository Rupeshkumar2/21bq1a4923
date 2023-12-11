import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        System.out.print(prime(num)?"Prime number":"not a prime number");
    }

    static boolean prime(int num){
        if(num<=1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if(num%i==0)
                return false;
        return true;

    }
}
