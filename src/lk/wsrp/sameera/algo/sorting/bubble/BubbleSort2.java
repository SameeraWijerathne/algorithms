package lk.wsrp.sameera.algo.sorting.bubble;

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] nums = {3, 10, -20, 55, 125, -80, 40};

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    var temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
