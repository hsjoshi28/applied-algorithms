/*
public class temp {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int[] position = {-1, -1};

        int numArrays = M.length;
        int numElements = M[0].length;

        int start = 0;
        int end = numArrays*numElements-1;

        while(start <= end ){
            int mid = (start + end)/2;
            int rowVal = mid/numElements;
            int colVal = mid%numElements;

            if(M[rowVal][colVal ] == q) {
                position[0] = rowVal;
                position[1] = colVal ;
                return position;
            }

            if(M[rowVal][colVal ]<q){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        int M[][] = {{1, 3, 4, 5}, {5, 6, 7, 7}, {8, 10, 11, 12}, {12, 13, 15, 16}};
        int q = 15;
        boolean b = searchMatrix(M, q);
        System.out.println(b);
    }
}
*/
