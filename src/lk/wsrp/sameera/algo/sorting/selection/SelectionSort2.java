package lk.wsrp.sameera.algo.sorting.selection;

import java.util.Arrays;

public class SelectionSort2 {
    public static void main(String[] args) {
        int[] nums = {3, 10, -20, 55, 125, -80, 40};

        for (int i = nums.length - 1; i > 0; i--) {
            int max = nums[i];
            int maxIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (max < nums[j]) {
                    max = nums[j];
                    maxIndex = j;
                }
            }
            var temp = nums[i];
            nums[i] = max;
            nums[maxIndex] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
