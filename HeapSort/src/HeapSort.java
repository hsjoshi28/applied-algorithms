public class HeapSort {
    static void heapify(int A[], int n, int i) {

        int leftNode = 2 * i + 1;
        int rightNode = 2 * i + 2;
        int largest = i;

        if (leftNode < n && A[leftNode] > A[largest]) {
            largest = leftNode;
        }
        if (rightNode < n && A[rightNode] > A[largest]) {
            largest = rightNode;
        }
        if (largest != i) {
            swap(A, i, largest);
            heapify(A, n, largest);
        }
    }

    static void heapSort(int A[]) {

        int n = A.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(A, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            swap(A, 0, i);
            heapify(A, i, 0);
        }
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
