import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input area 
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();

        // backend 
        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The area is " + area);
        sc.close();
    }
}