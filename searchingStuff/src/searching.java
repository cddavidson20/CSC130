
public class searching {
    public static void main(String[] args){

        //Must be sorted
        int[] array = {1, 2, 3, 4, 4, 5, 6, 7, 8, 23};
        int length = array.length -1;

        binarySearch(array, 2);

        int returnVal = recursiveBinarySearch(array, 0, length-1 , 7);
        System.out.print("Found the value at: " + returnVal);
    }

    public static void binarySearch(int[] sortedArray, int number) {
        int first = 0;
        int last = sortedArray.length - 1;
        int middle = (first + last) / 2;
        while (first <= last) {
            if (sortedArray[middle] < number) {
                first = middle + 1;
            } else if (sortedArray[middle] == number) {
                System.out.printf(number + " found at location %d %n", middle);
                return;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        System.out.println(number + " is not present in the list.\n");
    }

     private static int recursiveBinarySearch(int arr[], int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x){
                return mid;
            }
             if (arr[mid] > x)
                 return recursiveBinarySearch(arr, left, mid - 1, x);

             return recursiveBinarySearch(arr, mid + 1, right, x);
         }
         return -1;
     }
}
