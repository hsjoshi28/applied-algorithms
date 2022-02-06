import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] nums = new int[nums1.length + nums2.length];
        // Copy nums1 to nums
        for (int i = 0; i < nums1.length; i++)
            nums[i] = nums1[i];

        // Copy nums2 to nums
        for (int i = nums1.length, j = 0; j < nums2.length; i++, j++)
            nums[i] = nums2[j];

        //Sort array
        Arrays.sort(nums);

        double median = 0.0;
        // Calculate Median
        if ((nums.length % 2) != 0) { // Odd nos in array
            median = nums[(nums.length) / 2];
        } else { // Even nos in array
            median = (double) (nums[(nums.length - 1) / 2] + nums[(nums.length + 1) / 2]) / 2;
        }
        //Round off to 5 decimals using BigDecimal class
        BigDecimal bd = new BigDecimal(Double.toString(median));
        bd = bd.setScale(5, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        findMedianSortedArrays(nums1, nums2);
    }


}
