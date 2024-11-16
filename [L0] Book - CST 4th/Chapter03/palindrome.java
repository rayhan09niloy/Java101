import java.util.Scanner;

public class palindrome {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = 0;
        int sum = 0;
        int temp = 0;
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        temp = n;
        while(n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        
        if(sum == temp) {
            System.out.println("Following is a Palindrome number");
        } else {
            System.out.println("Following isn't a Palindrome number");
        }


        sc.close();
    }

}
