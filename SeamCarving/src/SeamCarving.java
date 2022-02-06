import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeamCarving {
    static int[] carve_seam(int disruption[][]) {
        int m = disruption.length;
        int n = disruption[0].length;
        int[][] nearestNeighbour = new int[m][n];

        //copy last row to first row of nearest neighbour
        for (int i = 0; i < n; i++) {
            nearestNeighbour[0][i] = disruption[m-1][i];
        }

        //find nearest neighbour downwards...
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(j==0) {
                    nearestNeighbour[i][j] = min(nearestNeighbour[i-1][j], nearestNeighbour[i-1][j+1]) + disruption[i][j];
                }else if(j == n-1){
                    nearestNeighbour[i][j] = min(nearestNeighbour[i-1][n-1], nearestNeighbour[i-1][n-2]) + disruption[i][j];
                }else {
                    nearestNeighbour[i][j] = min(nearestNeighbour[i - 1][j - 1], nearestNeighbour[i - 1][j], nearestNeighbour[i - 1][j + 1]) + disruption[i][j];
                }
            }
        }

        //to make a seam
        print2D(disruption);
        System.out.println("**************************");
        print2D(nearestNeighbour);
        
        int  i[] = traverseNearestNeighbour(nearestNeighbour);
        for (int a:
             i) {
            System.out.println(a);
        }


        return null;
    }

    private static int[] traverseNearestNeighbour(int[][] nearestNeighbour){
        int[] col = nearestNeighbour[0];
        min(col);
    }

    private static void min(int[] col) {
    }


    private static int min(int i, int i1) {
        if(i <= i1)
            return i;
        return i1;
    }

    public static void print2D(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }

    }

    private static int min(int i, int i1, int i2) {
        if (i <= i1 && i <= i2)
            return i;
        if (i1 <= i2 && i1 <= i)
            return i1;
        return i2;
    }

    public static void main(String[] args) {
        int[][] disruption = {
                {1, 2, 0, 3},
                {1, 2, 3, 0},
                {1, 2, 3, 0},
                {1, 2, 0, 3}
        };
        int[] ans = {2, 3, 3, 2};
        int[] ans1 = carve_seam(disruption);

    }
}