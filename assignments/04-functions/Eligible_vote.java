import java.util.Scanner;

public class Eligible_vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte age=sc.nextByte();
        checkAge(age);
    }

    static void checkAge(int age){
        System.out.print(age>=18?"Eligible for vote":"not eligible for vote");
    }
}
