public class FindEvenNumberDigits {
    public static void main(String[] args) {

        int[] nums = {555,901,482,1771};
        System.out.println(findEvenNumberDigits(nums));

    }

    public static int findEvenNumberDigits(int[] nums) {
        int cont = 0;
        for (int i = 0; i < nums.length; i++) {
          String s = String.valueOf(nums[i]);
          if (s.length() % 2 == 0) {
              cont++;
          }
        }
        return cont;
    }
}
