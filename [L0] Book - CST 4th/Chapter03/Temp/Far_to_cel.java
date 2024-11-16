import java.util.Scanner;

public class Far_to_cel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temprature in °F: ");
        double farTempInput = sc.nextDouble();

        double farConvertcel = ((farTempInput - 32) / 9) * 5;

        System.out.println("The temp in celsius is " + farConvertcel);
        sc.close();
    }
}
