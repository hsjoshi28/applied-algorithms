public class BinarySearch2D {

    static int[] search(int[][] M, int q) {
        int[] position = {-1, -1};
        if(M.length == 0)
            return position;

        int numArrays = M.length;
        int numElements = M[0].length;

        int start = 0;
        int end = numArrays * numElements - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;

            int rowVal = mid / numElements;
            int colVal = mid % numElements;


            if (M[rowVal][colVal] == q) {
                position[0] = rowVal;
                position[1] = colVal;
                return position;
            }

            if (M[rowVal][colVal] < q) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return position;
    }

}

