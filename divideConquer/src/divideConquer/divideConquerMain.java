package divideConquer;

public class divideConquerMain {
    public static void main(String[] args) {
        System.out.println("Started");
        int[] array1 = {-10,-18,1,2,3,4,5,5,7,8};
        int[] array2 = {3,5,2,6,7,8,21,6,7};

        int arr1Largest = findLargest(array1); //find the largest in arr1
        int arr2Largest = findLargest(array2); //find the largest in arr2

        System.out.println("Max from array1: " + arr1Largest);
        System.out.println("Max from array1: " + arr2Largest);

        System.out.print("The largest is: " + largestVal(arr1Largest, arr2Largest));
    }

    //return the largest value in an array
    private static int findLargest(int[] a) {
        int max = a[0];
        for(int i = 1; i < a.length;i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    //return the largest of two values
    private static int largestVal(int a, int b) {
        return Math.max(a, b);
    }
}
