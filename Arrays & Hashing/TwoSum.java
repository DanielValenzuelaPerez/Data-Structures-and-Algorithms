import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] indexes = twoSum(new int[] { 3, 3 }, 6);
        for (int i : indexes) {
            System.out.print(i + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> nums_set = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums_set.containsKey(nums[i]))
                return new int[] { i, nums_set.get(nums[i]) };
            else
                nums_set.put(target - nums[i], i);
        }
        return new int[] {};
    }
}
