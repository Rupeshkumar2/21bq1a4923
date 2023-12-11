import java.util.Scanner;

public class Grading_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte marks=sc.nextByte();
        grades(marks);
    }

    static void grades(int marks){
        if(marks>=91 && marks<=100)
            System.out.print("AA");
        else if (marks>=81 && marks<=90)
            System.out.print("AB");
        else if (marks>=71 && marks<=80)
            System.out.print("CC");
        else if(marks>=61 && marks<=70)
            System.out.print("BC");
        else if(marks>=51 && marks<=60)
            System.out.print("CD");
        else if(marks>=41 && marks<=50)
            System.out.print("DD");
        else if(marks<=40)
            System.out.print("Fail");
    }
}
