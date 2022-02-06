public class BinarySearch2D_1 {

    static int[] search(int[][] M, int q) {
        int[] position = {-1, -1};
        int lastRow[] = M[M.length-1];
//        int i = lastRow[lastRow.length-1];
//        M.Get
        int low = 0;
        int rowVal = 0;
        int colVal = 0;

        for ( int i = 0  ; i < M.length - 1; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if(M[i][j] == q) {
                    position[0] = i;
                    position[1] = j;
                }
            }
        }

//        while(high >= low){
/*
//            int midRow[] = M[(M.length-1)/2];
            int midElement = (high + low) / 2;
            int midVal = M[row][midElement%lastRow.length];
            System.out.println(midElement);
            if(midElement == q)
//                To Do
                System.out.println("midelem == q");
            else if(midElement < q)
                low = midElement+1;
            else
                high = midElement - 1;


        } */
//        System.out.println(high);
        System.out.println(low);

        return position;
    }



    public static void main(String[] args) {
        int M[][] = {{1, 3, 4, 5}, {5, 6, 7, 7}, {8, 10, 11, 12}, {12, 13, 15, 16}};
        int q = 5;
        int[] coords = BinarySearch2D_1.search(M, q);
        System.out.println("****8");
        for (int a: coords
             ) { System.out.println(a);

        }


    }
}
