// package statement
package Program_for_areas;

// import statement 
import java.util.Scanner;

// program 
public class areaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the a? ");
        int a = sc.nextInt();
        
        double areaOfsquare = a * a; 

        System.out.println("The area of circle is " + areaOfsquare);
        
        sc.close();
    }
}
