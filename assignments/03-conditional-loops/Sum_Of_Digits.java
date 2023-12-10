import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();int sum=0;

        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        System.out.print("Sum of digits:"+sum);
    }
}
