package divideConquer;

public class divideConquerMain {
    public static void main(String[] args) {
        System.out.println("Started");
        int[] array1 = {2,3,4,5,7,35};
        int[] array2 = {7,13,20,32};
        //which nth largest element
        int n = 8;

        int theNth = findNth(array1, array2, array1.length, array2.length, n);

        System.out.print("The " + n + "th largest is: " + theNth);
    }

    //return the largest value in an array
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
}
