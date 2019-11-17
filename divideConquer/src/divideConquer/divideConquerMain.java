package divideConquer;

import java.util.Arrays;

public class divideConquerMain {
    public static void main(String[] args) {
        System.out.println("Started");
        int[] array1 = {2,3,4,5,7,35};
        int[] array2 = {7,13,20,32};
        //which nth largest element
        int n = 8;

        //merged approach
        int theNth = findNth(array1, array2, array1.length, array2.length, n);
        System.out.println("The " + n + "th largest is: " + theNth);

        int k = 5;

        //recursive approach assuming positive array values
        int theKth = findKth(array1, array1.length, array2, array2.length, k);
        if (theKth == -1)
            System.out.println("Invalid query");
        else
            System.out.println("The " + k + "th largest is: " + theKth);
    }

    //sorted and merged array approach
    private static int findNth(int[] a, int[] b, int aLen, int bLen, int n) {

        int [] sorted = new int[aLen + bLen];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<aLen && j<bLen){
            if (a[i] < b[j])
                sorted[k++] = a[i++];
            else
                sorted[k++] = b[j++];
        }

        while (i < aLen)
            sorted[k++] = a[i++];
        while (j < bLen)
            sorted[k++] = b[j++];

        return sorted[n - 1];
    }

    private static int findKth(int[] arr1, int m, int[] arr2, int n, int k) {
        if (k > (m + n) || k < 1)
            return -1;

        // let m > n
        if (m > n)
            return findKth(arr2, n, arr1, m, k);

        // if arr1 is empty returning k-th element of arr2
        if (m == 0)
            return arr2[k - 1];

        // if k = 1 return minimum of first
        // two elements of both arrays
        if (k == 1)
            return Math.min(arr1[0], arr2[0]);

        // now the divide and conquer part
        int i = Math.min(m, k / 2);
        int j = Math.min(n, k / 2);

        if (arr1[i - 1] > arr2[j - 1]) {
            //Copy the array with a smaller increment to
            // recursively call against new array
            int[] temp = Arrays.copyOfRange(arr2, j, n);
            return findKth(arr1, m, temp, n - j, k - j);
        }

        //Copy the array with a smaller increment to
        // recursively call against new array
        int[] temp = Arrays.copyOfRange(arr1, i, m);
        return findKth(temp, m - i, arr2, n, k - i);
    }
}
