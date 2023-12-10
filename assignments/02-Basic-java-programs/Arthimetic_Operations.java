import java.util.Scanner;

public class Arthimetic_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2= sc.nextInt();

        String operator=sc.next();
        switch (operator){
            case "+" : System.out.println("Sum is:"+(num1+num2));
            break;
            case "-" : System.out.println("Difference is:"+(num1-num2));
            break;
            case "/" : System.out.println("Divison is:"+(float)(num1/num2));
            break;
            case "*" : System.out.println("Multiplication is:"+(num1*num2));
            break;
            case "%" : System.out.println("Modulus is:"+(num1%num2));
            break;
            default:System.out.println("Enter valid operator:");
            break;
        }

    }
}
