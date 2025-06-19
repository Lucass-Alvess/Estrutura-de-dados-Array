public class MaxConsecutiveOnes {

    public static void main(String[] args) {

        int[] nums = {1, 0, 1, 1, 0, 1};

        System.out.println(maxConsecutiveOnes(nums));

    }
    public static int maxConsecutiveOnes(int[] nums) {
        int cont = 0;
        int contMaior = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cont++;
                if (cont > contMaior) {
                    contMaior = cont;
                }
            } else {
                cont = 0;
            }
        }

        return contMaior;
    }
}
