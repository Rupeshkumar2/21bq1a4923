import java.util.Scanner;

public class Infinite_loop {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            String input = sc.nextLine();
            if (input.equals("x"))
                break;
            try{
                int num=Integer.parseInt(input);
                sum+=num;
            }catch (NumberFormatException e){
                System.out.println("Invalid input");
            }
        }System.out.println("sum:"+sum);
    }
}
