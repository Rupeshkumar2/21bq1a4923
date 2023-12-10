import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
        System.out.print(year%4==0 ? year+" is a leap year" : "is not a leap year");
    }
}
