public class InsertionSort {

    static void sort(int A[]) {
        /*assert (0 < A.length);
        int marker = 0;
        for(int i = 1 ; i < A.length && marker < A.length; i++) {
            if (A[i] < A[marker]) {
                int temp = A[marker];
                A[marker] = A[i];
                A[i] = temp;
            }
            marker++;
        }

        sorted(A, 0, A.length);

        for (int a: A
             ) {
            System.out.println(a);
        }*/
        assert (0 < A.length);
        int i = 1;
        while (i < A.length) {
             int marker = A[i];
             int j = i - 1;
             while (j >= 0 && A[j] > marker) {
                 A[j + 1] = A[j];
                 j = j - 1;
             }
             A[j + 1] = marker;
            ++i;
        }
        for (int a: A) {
            System.out.println(a);
        }
      }

    static Boolean sorted(int A[], int begin, int end) {
        assert (A.length > 0);
        for (int i = begin; i != end; ++i) {
            if (i + 1 != end) {
                if (A[i] > A[i+1]) return false;
            }
        }
        System.out.println("Sorted elements!!");
        return true;
    }

    public static void main(String[] args) {
        int A[] ={5,7,1,6};
        sort(A);
    }
}
