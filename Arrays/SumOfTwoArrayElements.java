// ################## Brute force Approach O(Q*N) TC and O(1) SC ###################
package Arrays;
import java.util.Scanner;

public class SumOfTwoArrayElements {

    static int e, s;

    public static void main(String args[]) {
        int sum = 0;
        int[] arrayQ = {-3, 6, 2, 4, 5, 2, 8, -9, -3, 1};
        int Q = 2;

        for (int i = 0; i < Q; i++) {
            scan();
            for (int j = s; j <= e; j++) {
                sum += arrayQ[j];
            }
            System.out.println("For" + i + "query sum is " + sum);
        }
    }

    static void scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for variable s");
        s = scanner.nextInt();
        System.out.print("Enter value for variable e");
        e = scanner.nextInt();
    }

}

