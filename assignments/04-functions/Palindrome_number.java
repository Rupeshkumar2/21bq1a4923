import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        System.out.print(Palindrome(str)?"Palindrome Number":"Not a palindrome Number");
    }

    static boolean Palindrome(String n){
        for (int i = 0; i < n.length()/2; i++) {
            if(n.charAt(i)!=n.charAt(n.length()-i-1))
                return false;
        }return true;
    }
}
