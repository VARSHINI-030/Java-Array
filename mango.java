
import java.util.Scanner;

public class mango {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tree_no = sc.nextInt();
        boolean ismango = false;

        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (tree_no == arr[i][j]) {
                    if (i == 1 || i == arr.length - 2) {
                        ismango = true;
                    }
                }

            }
        }
        if (ismango == true) {
            System.out.print("it is a mango tree");
        } else {
            System.out.print("Not");
        }
    }
}
