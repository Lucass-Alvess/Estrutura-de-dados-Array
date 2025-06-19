public class DotProductTwoArrays {
    public static void main(String[] args) {

        int[] nums = {0,1,0,0,2,0,0};
        int[] num2 = {1,0,0,0,3,0,4};
        System.out.println(dotProduct(nums, num2));
    }

    public static int dotProduct(int[] nums1, int[] nums2) {

        int total = 0;
        for (int i = 0; i < nums1.length; i++) {
            total += nums1[i] * nums2[i];
        }

        return total;
    }
}
