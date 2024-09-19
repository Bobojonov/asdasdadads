package neetcode.queue;

public class KThLargestElement {
    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int pivot = partitioned(nums, l, r);
            if (pivot == k) break;
            else if (pivot < k) l = pivot + 1;
            else r = pivot - 1;
        }
        return nums[k];
    }
    
    public static int partitioned(int[] nums, int l, int  r) {
        int pivot = nums[r], fill = l;
        for (int i = l; i < r; i++) {
            if (nums[i] <= pivot) {
                int tmp = nums[fill];
                nums[fill++] = nums[i];
                nums[i] = tmp;
            }
        }
        nums[r]  = nums[fill];
        nums[fill] = pivot;
        return fill;
    }
}
