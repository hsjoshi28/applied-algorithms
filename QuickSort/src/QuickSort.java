public class QuickSort {

    static int partition(int A[], int p, int r) {
        int pivot = A[p];
        int i = p - 1;
        int j = r;

        while (true) {
            do {
                i = i + 1;
            } while (A[i] < pivot);
            do {
                j = j - 1;
            } while (A[j] > pivot);
            if (i >= j) {
                return j;
            }
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }

    static void sort(int A[], int p, int r) {
        while(true) {
            int pi = partition(A, p, r);

            sort(A, p, pi + 1);
            sort(A, pi + 1, r);
        }

    }

    public static void main(String[] args) {
        int i = 0;
        while(true){
            i++;
        }
    }
}
