import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first value: ");
        int a = sc.nextInt();

        System.out.println("Enter the second value: ");
        int b = sc.nextInt();
        
        System.out.println("Enter the third value: ");
        int c = sc.nextInt();

        System.out.println("Enter the forth value: ");
        int d = sc.nextInt();

        int avg = (a + b + c + d) / 4;

        System.out.println("The avarage is " + avg);

        sc.close();
    }
}
