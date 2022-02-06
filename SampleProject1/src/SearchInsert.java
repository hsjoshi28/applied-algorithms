public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;

        while (high >= low) {
            int midPosition = (low + high) / 2;

            if (nums[midPosition] == target) {
                return midPosition;
            } else if (nums[midPosition] < target) {
                low = midPosition + 1;
            } else {
                high = midPosition - 1;
            }
        }
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > target)
                return i;
        return nums.length;
    }
}
