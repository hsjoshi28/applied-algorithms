

public class InversionCount {
    public static int[] inversionCount;

    public static int[] count(int[] A) {
        int[] inversionCount;
        inversionCount = new int[A.length];
        int[][] temp = new int[A.length][A.length];
        int[][] Arr = new int[A.length][A.length];

        for (int i = 0; i < A.length; i++) {
            Arr[i][0] = i;
            Arr[i][1] = A[i];
        }

        sort(Arr, temp, inversionCount, 0, A.length);
        return inversionCount;
    }

    static void merge(int A[][], int temp[][], int[] inversionCount, int start, int mid, int end) {
        for (int i = start; i < end; i++)
            temp[i] = A[i];
        int i = start, j = mid + 1, k = start;

        while (k < end) {
            if (i > mid) {
                A[k++] = temp[j++];
            } else if (j > end - 1) {
                inversionCount[temp[i][0]] += k - i;
                A[k++] = temp[i++];
            } else if (temp[j][1] < temp[i][1]) {
                A[k++] = temp[j++];
            } else {
                inversionCount[temp[i][0]] += k - i;
                A[k++] = temp[i++];
            }
        }
    }

    static void sort(int A[][], int temp[][], int[] inversionCount, int p, int r) {
        if (p < r - 1) {
            int q = p + (r - 1 - p) / 2;
            sort(A, temp, inversionCount, p, q + 1);
            sort(A, temp, inversionCount, q + 1, r);

            merge(A, temp, inversionCount, p, q, r);
        }
    }

}