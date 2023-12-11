import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        Min(num1,num2,num3);
        Max(num1,num2,num3);
    }

    static void Min(int a, int b, int c){
        System.out.println("Min is:"+((a<b?a:b)<c?a:c));
    }
    static void Max(int a,int b, int c){
        System.out.print("Max is:"+((a>b?a:b)>c?a:c));
    }
}
