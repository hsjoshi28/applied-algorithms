import java.util.Arrays;
import java.util.Comparator;

public class Scheduling {

    public static int schedule(int[][] A) {
        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] > o2[1])
                    return 1;
                else
                    return -1;
            }
        });
        int job = 1;
        int startPrev = A[0][0];
        int endPrev = A[0][1];

        for (int j = 1; j < A.length; j++) {
            if (A[j][0] > A[j][1]) {
                continue;
            }
            if ((startPrev < endPrev) && (A[j][0]) >= endPrev) {
                job++;
                startPrev = A[j][0];
                endPrev = A[j][1];
            }
            if (startPrev > endPrev) {
                if ((A[j][0] >= endPrev) && (A[j][1] <= startPrev)) {
                    job++;
                    endPrev = A[j][1];
                }
            }
        }
        return job;
    }
}
