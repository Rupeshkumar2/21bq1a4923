import java.util.Scanner;

public class Fibanocci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int start=0,end=1;
        System.out.print(0+" "+1);

        for (int i = 2; i <= n; i++) {
            int temp=start+end;
            start=end;
            end=temp;
            System.out.print(" "+temp);
        }
    }
}
