import java.util.Arrays;

public class ContainsDuplicate {

    public static void main(String[] args) {
         int[] nums = {1,2,3,1};
         int[] nums2 = {1,2,3,4};
         int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
         System.out.println(containsDuplicate(nums));
         System.out.println(containsDuplicate(nums2));
         System.out.println(containsDuplicate(nums3));

    }

    public static Boolean containsDuplicate(int[] nums) {

        Boolean duplicate = false;
        Arrays.sort(nums);


        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                duplicate = true;
                break;
            }

        }
        return duplicate;
    }
}
