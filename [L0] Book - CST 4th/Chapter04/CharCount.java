import java.util.Scanner;

public class CharCount {
    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your txt: ");
        String str = sc.nextLine();
        
        int count = 0;

        int i;
        for(i = 0; i < str.length(); i++) {
            if (String.valueOf(i) != " ") {
                count++;
            }
        }

        System.out.println("the total charecter is " + count);
        sc.close();
    }
}
