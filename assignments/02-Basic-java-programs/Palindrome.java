import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverseStr="";

        for (int i = (str.length()-1); i >= 0; i--) {
            reverseStr+=str.charAt(i);
        }
        if(str.toLowerCase().equals(reverseStr.toLowerCase()))
            System.out.println("Given string is palindrome");
        else
            System.out.println("Given string is not palindrome");
    }
}
