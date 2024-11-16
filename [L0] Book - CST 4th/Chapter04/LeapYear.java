import java.util.Scanner;

public class LeapYear {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int n = sc.nextInt();

        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            System.out.println(n + " is a Leap year.");
        } else {
            System.out.println(n + " isn't a Leap year");
        }


        sc.close();
    }
}
