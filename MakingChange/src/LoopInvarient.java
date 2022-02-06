public class LoopInvarient {
    static int search_loop(int A[], int key) {
        int low = 0;
        int high = A.length;
        int mid = 0;
        int result = -1;
        (result == -1
                && !contains(A, key, 0, low)
                && ! contains(A, key, high, A.length))
                || A[result]  == key)
        while (low != high && result == -1) {
            mid = (low + high) / 2;
            if (A[mid] < key)
                low = mid + 1;
            else if (A[mid] > key)
                high = mid;
            else {
                result = mid;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        
    }
}
