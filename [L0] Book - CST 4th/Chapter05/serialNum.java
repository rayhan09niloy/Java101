import java.util.Arrays;
import java.util.Scanner;

public class serialNum {
    /**
     * @param args
     */
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int i;
        int arr[] = new int[10];

        for(i = 0; i < 10; i++) {
            
            System.out.print("Enter a number: ");
            int a = sc.nextInt();
            arr[i] = a;
        }
        
        Arrays.sort(arr);
        System.out.println("The array is " + arr);
        sc.close();
    }
}
