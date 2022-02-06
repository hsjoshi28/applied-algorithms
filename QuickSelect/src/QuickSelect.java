public class QuickSelect {
    static int select(int[] A, int k) {
        return kthSmallest(A, 0, A.length - 1, k + 1);
    }

    static int kthSmallest(int A[], int l, int r, int k) {
        if (k > 0 && k <= r - l + 1) {
            int pivot = partition(A, l, r);

            if (pivot - l == k - 1)
                return A[pivot];

            if (pivot - l > k - 1)
                return kthSmallest(A, l, pivot - 1, k);

            return kthSmallest(A, pivot + 1, r, k - pivot + l - 1);
        }
        return Integer.MAX_VALUE;
    }

    static int partition(int A[], int l, int r) {
        int x = A[r], i = l;
        for (int j = l; j <= r - 1; j++) {
            if (A[j] <= x) {
                swap(A, i, j);
                i++;
            }
        }
        swap(A, i, r);
        return i;
    }

    static int randomPartition(int A[], int l, int r) {
        int n = r - l + 1;
        int pivot = (int) (Math.random()) * (n - 1);
        swap(A, l + pivot, r);
        return partition(A, l, r);
    }

    static void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
