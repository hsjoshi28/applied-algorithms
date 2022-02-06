import java.util.Arrays;

public class BinarySearch {
    static int search(int A[], int key){
        int high = A.length-1;
        int low = 0;

        while(high >= low){
            int midPosition;
            midPosition = (low + high) / 2;

            if(A[midPosition] == key) {
                return midPosition;
            } else if (A[midPosition] < key) {
                low = midPosition + 1;
            } else
                high = midPosition - 1;
        }
        return -1;
    }

}
