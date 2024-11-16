import java.util.Scanner;

public class n7NumberLoop {
    
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int i;

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(i = 1; i <= n; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}