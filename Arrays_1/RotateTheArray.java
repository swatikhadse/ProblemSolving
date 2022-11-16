package Arrays_1;
/*
Given an Array of size N Rotate the array from last to first Clockwise means array
from last to first Clockwise K times Expected SC==O(N)
 */
//Approach 1: Reverse full array then parts of array TC==O(N)

public class RotateTheArray {
    static int k = 3;
    static int A[] = {-5, -7, 4, -3, 0, 7, 4, 6};

    public static void main(String[] args) {
        //Step 1: reverse array
        reverseArray(A,0,A.length-1);
        //Step 2: reverse array from 0 to k-1==(k elements)
        reverseArray(A, 0, k - 1);
        //Step 2: reverse array from k to N-1==(N-k elements)
        reverseArray(A, k, A.length-1);
        //To print Array
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void reverseArray(int A[],int x,int y) {
        int s = x;
        int e = y;
        while (s < e) {
            // swapNumbers(A[s], A[e]);
            A[s] = A[s] + A[e];
            A[e] = A[s] - A[e];
            A[s] = A[s] - A[e];
            s++;
            e--;
        }
    }
}
