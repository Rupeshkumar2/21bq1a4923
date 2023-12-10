// pattern in java
// 9/12/23

public class Patterns {
    public static void main(String[] args) {
        pattern25(5);
    }

    // Square Hollow pattern
    static void pattern1(int n){
        int i,j;
        for (i = 0; i < n; i++) {
            for(j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }

    //Number Triangular
    static void pattern2(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (j = 1; j <= i ; j++) {
                System.out.print(i+" ");
            }System.out.println();
        }
    }

    //Number Increasing pyramid
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }System.out.println();
        }
    }

    //Number increasing reverse pyramid
    static void pattern4(int n){
        for (int i = n; i > 0; i--) {
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }System.out.println();
        }
    }

    //Number changing pyramid
    static void pattern5(int n){
        byte num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ +" ");
            }System.out.println();
        }
    }

    //Zero-One triangle
    static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)System.out.print(1+" ");
                else System.out.print(0+" ");
            }System.out.println();
        }
    }

    //Palindrome Triangle
    static void pattern7(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            for (j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }System.out.println();
        }
    }

    //Rhombus pattern
    static void pattern8(int n){
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j < n; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }

    //Diamond pattern
    static void pattern9(int n){
        int i,j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }System.out.println();
        }
        for (i = n-1; i >= 1; i--) {
            for (j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }System.out.println();
        }
    }

    //Butterfly Star Pattern
    static void pattern10(int n){
        int i,j;
        for (i = 1;i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces=2*(n-i);
            for (j = 1;j <= spaces ; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }System.out.println();
        }
        for (i = n;i>=1;i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces=2*(n-i);
            for (j = 1;j <= spaces ; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }System.out.println();
        }
    }

    //Sqaure fill pattern
    static void pattern11(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }

    //Right-half pyramid
    static void pattern12(int n){
        for(int i=0;i<n;i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }

    //Reverse right half pyramid
    static void pattern13(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }

    //left-half pyramid
    static void pattern14(int n){
        int j;
        for (int i = 1; i <= n; i++) {
            for (j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }System.out.println();
        }
    }

    //reverse left-half pyramid
    static void pattern15(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }System.out.println();
        }
    }

    //K pattern
    static void pattern16(int n){
        int i,j;
        for (i = n; i > 0; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
        for (i = 2; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }

    //Triangle star pattern
    static void pattern17(int n){
        int i,j;
        for (i = 0; i < n; i++) {
            for (j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }

    //Reverse Number Triangle pattern
    static void pattern18(int n){
        int i,j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n ; j++) {
                System.out.print(j+" ");
            }System.out.println();
        }
    }

    //Mirror image triangle pattern
    static void pattern19(int n){
        int i,j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print(j + " ");
            }System.out.println();
        }
        for (i = n-1; i >= 1 ; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print(j+" ");
            }System.out.println();
        }
    }

    //Hollow triangle pattern
    static void pattern20(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print((k==1 || i==n || k==(2*i-1) ? "*" : " "));
            }System.out.println();
        }
    }

    //Hollow reverse triangle pattern
    static void pattern21(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }for (int k = 1; k <= (2*i-1); k++) {
                System.out.print((k==1 || i==n || k==(2*i-1) ? "*" : " "));
            }System.out.println();
        }
    }

    //Hollow diamond pattern
    static void pattern22(int n){
        int i,j;
        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print((k==1 || k==(2*i-1) ? "*" : " "));
            }System.out.println();
        }
        for (i = n-1; i >= 1; i--) {
            for (j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print((k==1 || k==(2*i-1) ? "*" : " "));
            }System.out.println();
        }
    }

    //Hollow Hour-glass pattern
    static void pattern23(int n){
        int i,j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j=i; j <= n; j++) {
                System.out.print((j==i || j==n || i==1) ? "* " : "  ");
            }System.out.println();
        }
        for (i = n-1; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j=i; j <= n; j++) {
                System.out.print((j==i || j==n || i==1) ? "* " : "  ");
            }System.out.println();
        }
    }

    //Pascal's triangle
    static void pattern24(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
            }
            int num=1;
            for (int k = 1; k <= i; k++) {
                System.out.print(num+" ");
                num = num * (i - k) / k;
            }System.out.println();
        }
    }

    //Right Pascals's triangle pattern
    static void pattern25(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }
}
