import java.util.HashMap;

public class MajorityElement {
    public static int majority(int[] A) {

        HashMap<Integer, Integer> majorityCount = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (majorityCount.containsKey(A[i])) {
                count = majorityCount.get(A[i]) + 1;
                majorityCount.put(A[i], count);
            } else
                majorityCount.put(A[i], 1);
        }
        for (int i = 0; i < majorityCount.size(); i++) {
            count = majorityCount.get(A[i]);
            if (count > A.length / 2) {
                return (A[i]);
            }
        }
        return -1;
    }
}
