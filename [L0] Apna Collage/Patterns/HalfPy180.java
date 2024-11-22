package Patterns;

public class HalfPy180 {
    public static void main(String args[]) {
        int n = 5;
        
        for(int i = 1; i <= n; i++) {
            for(int j = n; j <= i; j--) {
                // System.out.print("*");
                if(i == 1 || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}