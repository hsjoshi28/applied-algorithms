public class PatternPrinting {
    static class Solution {
        public boolean checkPossibility(int[] nums) {
            boolean result = false;
            if (!(nums.length > 1 && nums.length < 100000)) // Constraint check: 1 <= n <= 10^4
                return result;
            for(int i = 0 ; i < nums.length; i++) {
                if (!(nums[i] > -1000000 && nums[i] <= 1000000)) // Constraint check: -10^5 <= nums[i] <= 10^5
                    return result;
                int j = i+1;
                if (nums[i] <= nums[j])
                    result = true;
            }
            return result;
        }



    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {3,4,2,3};
        solution.checkPossibility(nums);
    }
}
