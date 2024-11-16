import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Genaral Quadratic Equation: ax^2 + bx + c");

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();
        
        double d = (b * b) - (4 * a * c);

        if(d > 0) {
            double x1 = (- b + Math.sqrt(d)) / (2 * a);
            double x2 = (- b - Math.sqrt(d)) / (2 * a);
            System.out.println("The root are " + x1 + " and " + x2);
        } else if(d == 0) {
            double x = (- b) / (2 * a);
            System.out.println("The root are " + x);
        } else {
            System.out.println("Root aren't possible!");
        }

        sc.close();
    }
}
