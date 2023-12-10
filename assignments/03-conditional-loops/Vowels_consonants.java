import java.util.Scanner;

public class Vowels_consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'i';

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            System.out.print("Vowel");
        else
            System.out.print("Consonant");
    }
}
