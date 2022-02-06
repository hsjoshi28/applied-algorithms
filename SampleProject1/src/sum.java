import java.util.Arrays;

public class sum {

    public static int[] twoSum(int[] nums, int target) {
        if (!((2 <= nums.length) && (nums.length <= 100000)))              //Constraint check: 2 <= nums.length <= 10^4
            return new int[]{};
        if (!((-1000000000 <= target) && (target <= 1000000000)))          //Constraint check: -10^9 <= target <= 10^9
            return new int[]{};
        for (int i = 0; i < nums.length; i++) {
            if (!((-1000000000 <= nums[i]) && (nums[i] <= 1000000000)))    //Constraint check: -10^9 <= nums[i] <= 10^9
                return new int[]{};
            for (int j = 0; j < i; j++) {
                int num1 = nums[i];
                int num2 = nums[j];
                if ((num1 + num2) == target)
                    return new int[]{j, i};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int nums[] = {3, 2, 4};
        twoSum(nums, 6);
    }
}
