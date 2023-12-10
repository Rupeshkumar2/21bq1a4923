import java.util.Scanner;

public class Simple_Interest_Rate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        int time = sc.nextInt();
        int rate = sc.nextInt();

        System.out.print("Interest rate is "+((float)(principle*time*rate)/100));
    }
}
