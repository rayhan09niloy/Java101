import java.util.Scanner;

class nNumberLoop {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int i, sum = 0;

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(i = 1; i <= n; i++) {
            sum = sum + i;
        }
        
        System.out.println("The total is " + sum);
        sc.close();
    }
}