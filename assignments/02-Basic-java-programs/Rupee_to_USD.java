import java.util.Scanner;

public class Rupee_to_USD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rupees = sc.nextInt();
        System.out.println(rupees+" in USD "+(float)(rupees*0.012));
    }
}
