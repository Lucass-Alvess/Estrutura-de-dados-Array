import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};
        System.out.println(Arrays.toString(duplicateZeros(nums)));

    }

    public static int[] duplicateZeros(int[] nums) {
        int[] result = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length && j < nums.length; i++) {
            if (nums[i] == 0) {
                result[j++] = 0;
                if (j < nums.length) {
                    result[j++] = 0;
                }
            } else {
                result[j++] = nums[i];
            }
        }

        return result;
    }



}
