package lk.wsrp.sameera.algo.sorting.selection;

import java.util.Arrays;

public class SelectionSort1 {
    public static void main(String[] args) {
        int[] nums = {3, 10, -20, 55, 125, -80, 40};

        for (int i = 0; i < nums.length - 1; i++) {
            int min = nums[i];
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            var temp = nums[i];
            nums[i] = min;
            nums[minIndex] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
