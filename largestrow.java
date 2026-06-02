
import java.util.Scanner;

public class largestrow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int max = 0;
        int rowIndex = 0;

        for (int i = 0; i < r; i++) {
            int sum = 0;

            for (int j = 0; j < c; j++) {
                sum += sc.nextInt();
            }

            if (sum > max) {
                max = sum;
                rowIndex = i;
            }
        }

        System.out.println("The largest row is: " + rowIndex);
    }
}
