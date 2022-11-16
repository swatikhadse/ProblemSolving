package Arrays;
/*
Given N array elements Check if there exists a pair i, j such that a[i]+a[j]=k and i!=j.
 */

//Approach 1: using brute force TC==O(N2)

public class TwoSum {
    static int A[] = {2, 4, -3, 7};
    static int k = 11;

    public static void main(String[] args) {
        int s[] = sumOfTwoNumbers(A);
        System.out.println("i:: " + s[0] + " and " + "j:: " + s[1]);
    }

    public static int[] sumOfTwoNumbers(int A[]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] == k && i != j) {
                    return new int[]{i, j};
                }
            }

        }
        return null;
    }
}
