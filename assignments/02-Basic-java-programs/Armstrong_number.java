import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();

        System.out.print("Armstrong numbers between "+start +" and "+end+":");
        for (int i = start; i <= end; i++) {
            int sum=0;
            int num=i;
            while(num>0){
                int digit=num%10;
                sum+=digit*digit*digit;
                num/=10;
            }
            if(sum==i)
                System.out.print(i+" ");
        }
    }
}
