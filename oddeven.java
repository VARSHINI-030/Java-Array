
import java.util.Scanner;

public class oddeven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] even = new int[n];
        int[] odd = new int[n];

        int eCount = 0, oCount = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                even[eCount] = arr[i];
                eCount++;
            } else {
                odd[oCount] = arr[i];
                oCount++;
            }
        }

        System.out.println("Even Array:");
        for (int i = 0; i < eCount; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println("\nOdd Array:");
        for (int i = 0; i < oCount; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}
