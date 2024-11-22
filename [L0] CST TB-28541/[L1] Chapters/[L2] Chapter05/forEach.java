import java.util.Arrays;
 
public class forEach {
    public static void main(String[] args) {
        int arr[] = {1, 3, 3, 2, 4, 6, 7, 9 };
        Arrays.sort(arr);
        for(int elemen: arr) {
            System.out.println(elemen);
        }
    
    }
}
