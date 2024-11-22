import java.util.Scanner;

public class ArbittaryEqu {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first valube: ");
        int a = sc.nextInt();

        System.out.println("Enter the second value: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Summation is " + sum);
        int sub = a - b;
        System.out.println("Subtration is " + sub);
        int multy = a * b;
        System.out.println("multiplication is " + multy);
        float div = a / b;
        System.out.println("division is " + div);
        float mdls = a % b;
        System.out.println("modulas is " + mdls);

        sc.close();
    }
}
