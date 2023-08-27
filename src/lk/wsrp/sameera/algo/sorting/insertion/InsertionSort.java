package lk.wsrp.sameera.algo.sorting.insertion;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {3, 10, -20, 55, 125, -80, 40};

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                var insert = nums[i];
                for (int j = 0; j < i; j++) {
                    if (insert < nums[j]) {
                        for (int k = i; k > j; k--) {
                            nums[k] = nums[k - 1];
                        }
                        nums[j] = insert;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
