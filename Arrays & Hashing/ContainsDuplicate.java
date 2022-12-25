import java.util.HashSet;

class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] { 1, 2, 3, 4, 5, 7 }));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> num_set = new HashSet<>();
        for (Integer num : nums) {
            if (num_set.contains(num))
                return false;
            num_set.add(num);
        }
        return true;
    }
}