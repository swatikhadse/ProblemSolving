/*
Given N array elements, Count the number of elements having at least 1 element greater than itself.

Observations:
1. for max element there can't be any element greater than it
2 find count of man elements in the Array count
3 return (N-count)
 */

//Approach 1: using brute force TC==O(N) SC==O(1)
package Arrays_1;

public class MaxElement {

    static int A[] = {-3, -2, -4, 6, 4, 7, 5, 0, 7, 6, 5};
    static int count = 0;
    static int max = Integer.MIN_VALUE; // for negative values declare -infinity

    public static void main(String[] args) {
        //find the max element
        System.out.println("max element:: " + maxValue(A));
        //To count max element frequency
        System.out.println("frequency of max element:: " +frequency(A));
        //Total possible elements
        System.out.println("Number of elements:: " + (A.length-count));
    }

    public static int maxValue(int A[]) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    public static int frequency(int A[]) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == max) {
                count++;
            }
        }
        return count;
    }

}
