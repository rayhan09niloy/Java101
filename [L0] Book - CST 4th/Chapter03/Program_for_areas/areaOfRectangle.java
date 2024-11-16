// package statement
package Program_for_areas;

// import statement 
import java.util.Scanner;

// program 
public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the a? ");
        int a = sc.nextInt();
        
        System.out.println("Enter the b? ");
        int b = sc.nextInt();

        double areaOfRectangle = a * b; 

        System.out.println("The area of circle is " + areaOfRectangle);
        
        sc.close();
        
    }
}
