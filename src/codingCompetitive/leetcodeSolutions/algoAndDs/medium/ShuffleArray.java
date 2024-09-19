package codingCompetitive.leetcodeSolutions.algoAndDs.medium;

public class ShuffleArray {
    int[] a;
    int[] nums;
    public ShuffleArray(int[] nums) {
        this.nums = nums;
        a = new int[nums.length];
        System.arraycopy(nums, 0, a, 0, nums.length);
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        for (int i = 0; i < a.length; i++) {
            int rand = (int) (Math.random() * (a.length));
            int temp = a[i];
            a[i] = a[rand];
            a[rand] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
//        ShuffleArray obj = new ShuffleArray(nums);
//        int[] param_1 = obj.reset();
//        int[] param_2 = obj.shuffle();
    }
}
