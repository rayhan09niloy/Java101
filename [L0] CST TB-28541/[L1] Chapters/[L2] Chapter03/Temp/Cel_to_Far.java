import java.util.Scanner;

public class Cel_to_Far {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temprature in °C: ");
        double celTempInput = sc.nextDouble();

        double celConvertfar = ((9 * celTempInput) / 5) + 32;

        System.out.println("The temp in farhenhite is " + celConvertfar);
        sc.close();
    }
}
