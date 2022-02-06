import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    int num1 = nums[i];
                    int num2 = nums[j];
                    int num3 = nums[k];
                    if ((num1 + num2 + num3) == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(num1);
                        temp.add(num2);
                        temp.add(num3);
                        triplets.add(temp);
                        nums[k] = 999;
                        break;

                    }
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        threeSum(nums);
    }

}
