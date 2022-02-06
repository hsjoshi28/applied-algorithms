import java.util.Arrays;

public class InversionCount1 {
    /*public static int[] count(int[] A) {
        int countArray[] = new int[A.length];

        int count;
        for (int i = 0; i < A.length; i++) {            //n
            count = 0;                                  //n
            for (int j = i + 1; j < A.length; j++) {    //n*(n-1) = n^2 - n
                if (A[i] > A[j]) {                      //n^2 - n
                    count++;                            //n^2 - n
                }
            }
            countArray[i] = count;                      //n
        }

        return countArray;
    }*/

    public static int[] driveCount(int A[], int start, int end){
        int count[] = new int[A.length];
        int i = 0;
        int[] counter = new int[A.length];
        if (start < end - 1) {

                int m = (start + (end -1 - start)) / 2;
                counter = new int[A.length];
                // Total inversion count = left subarray count
                // + right subarray count + merge count

                // Left subarray count
//                counter[i] += Integer.parseInt(String.valueOf(count(A)));
//            counter[i] += Integer.parseInt(String.valueOf(driveCount(A, start, m+1)));
            int[] ints = driveCount(A, start, m + 1);


            // Right subarray count
//                counter[i] += Integer.parseInt(String.valueOf(count(A)));
//            counter[i] += Integer.parseInt(String.valueOf(driveCount(A, m+1, end)));
            int[] ints1 = driveCount(A, m +1, end);
            // Merge count
                counter[i] += mergeAndCount(A, start, m, end);
                count[i] = counter[i];

        }
        return count;
    }


    public static int[] count(int[] A){
        int count[] = new int[A.length];
        int i = 0;
        int[] counter;
        int l=0, r = A.length;
        if (l < r-1) {
            int m = (l + (r -1-l)) / 2;
            counter = new int[A.length];
            // Total inversion count = left subarray count
            // + right subarray count + merge count

            // Left subarray count
            counter[i] += Integer.parseInt(String.valueOf(count(A)));

            // Right subarray count
            counter[i] += Integer.parseInt(String.valueOf(count(A)));

            // Merge count
            counter[i] += mergeAndCount(A, l, m, r);
            count[i] = counter[i];
        }

        return count;
//        int [] temp = driveCount(A, 0, A.length+1);
//        return temp;
    }

    // Function to count the number of inversions
    // during the merge process
    private static int mergeAndCount(int[] arr, int l,
                                     int m, int r)
    {

        // Left subarray
        int[] left = Arrays.copyOfRange(arr, l, m-l + 1);

        // Right subarray
        int[] right = Arrays.copyOfRange(arr, m + 1, r -1-m+ 1);

        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    }

    public static void main(String[] args) {
        int A[] = {5,4,7,9,2};
        count(A);
    }

}
