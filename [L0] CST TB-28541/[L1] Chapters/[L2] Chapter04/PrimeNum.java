import java.util.Scanner;

public class PrimeNum {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            for(int i = 2; i <= n; i++) {
                
                int prime = 1;
                // System.out.println("This is i " + i);

                for(int j = 2; j <= i; j++) {
                    if (i % j == 0 && j != i) {
                        prime = 0; 
                        // System.out.println(prime);       
                    }
                }
                if (prime != 0) {
                    System.out.print(i + " ");
                    i++;
                } 
            }

            sc.nextInt();
        }
    }
}