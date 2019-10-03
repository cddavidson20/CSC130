
public class searching {
    public static void main(String[] args){

        //Must be sorted
        int[] array = {1, 2, 3, 4, 4, 5, 6, 7, 8, 23};
        int length = array.length -1;

        binarySearch(array, 7);

        int returnVal = recurisveBinarySearch(array, 0, length-1 , 7);
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
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println(number + " is not present in the list.\n");
        }
    }

     private static int recurisveBinarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x){
                return mid;
            }
             if (arr[mid] > x)
                 return recurisveBinarySearch(arr, l, mid - 1, x);

             return recurisveBinarySearch(arr, mid + 1, r, x);
         }
         return -1;
     }
}
