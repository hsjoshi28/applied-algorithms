public class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        int duplicates = 0;

        for (int i = 0, j = 1; j < nums.length; i++, j++) {
            if (nums[i] == nums[j]) {
                for (int k = j + 1; k < nums.length; k++, j++) {
                    nums[j] = nums[k];
                }
                j = i;
                duplicates++;
            }
        }
        if (duplicates == 0)
            return nums.length;
        if (duplicates == 1 && nums.length == 2 && nums[0] == nums[1])
            return duplicates ;
        if (duplicates == 1)
            return duplicates + 1;

        return duplicates;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
        int[] expectedNums = {0,1,2,3,4}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            if (nums[i] == expectedNums[i])
                System.out.println("I'am right");
            assert nums[i] == expectedNums[i];
        }


//        int[] nums = {1,1,2};
//        int result = removeDuplicates(nums);
//        System.out.println(result);
    }
}
