import java.util.Scanner;

public class Q5ans {
    
    public static float findAvg(int a, int b, int c) {
        
        float sum = a + b + c;
        float avg = sum / 3;
        return avg;
    }
    
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a");
        int a = sc.nextInt();
        
        System.out.println("Enter b");
        int b = sc.nextInt();
        
        System.out.println("Enter c");
        int c = sc.nextInt();
        
        float Avarage = findAvg(a, b, c);
        System.out.println("The avarage of 3 number is: " + Avarage);

        sc.close();
    }
}