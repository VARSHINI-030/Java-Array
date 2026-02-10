
import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no_of_elem = sc.nextInt();
        int[] a = new int[no_of_elem];

        for (int i = 0; i < no_of_elem; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < no_of_elem; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
