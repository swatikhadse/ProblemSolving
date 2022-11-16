/*
Given an Array, reverse the entire array. expected space complexity O(1)
OR
Given N array elements and indices [Si, Sj]. Reverse the array from Si to Sj. Si<=Sj.
Here S=Si and E=Sj rest code will be same
 */
//Approach 1: Two pointers method TC==O(N)
package Arrays_1;
public class ReverseTheArray {
    static int A[] = {-5, -7, 4, -3, 0, 7, 4, 6};
    public static void main(String[] args) {
        int s = 0;
        int e = A.length - 1;
        while (s < e) {
           // swapNumbers(A[s], A[e]);
            A[s]=A[s]+A[e];
            A[e]=A[s]-A[e];
            A[s]=A[s]-A[e];
            s++;
            e--;
        }
        //To print Array
        for(int i=0;i<A.length;i++){
            System.out.print(A[i] +" ");
        }
    }

}
