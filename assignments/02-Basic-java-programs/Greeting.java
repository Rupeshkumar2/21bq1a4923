import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Greet(name);
    }
    static void Greet(String name){
        System.out.print("hello "+name);
    }
}
