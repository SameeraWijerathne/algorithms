package lk.wsrp.sameera.algo.searching.binary;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-3, 2, 3, 5, 7, 8, 10, 11}; // This must be a sorted array to implement the Binary Search

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int search = scanner.nextInt();

        if (search < nums[0] || search > nums[nums.length - 1]) {
            System.out.println("Not found!");
            return;
        }

        int start = 0;
        int end = nums.length;
        while (start < end) {
            int middle = (start + end) / 2;
            if (search == nums[middle]) {
                System.out.printf("%s found at: %s", search, middle);
                return;
            } else if (search < nums[middle]) {
                end = middle;
            } else {
                start = middle;
            }
        }

        System.out.println("Not found!");
    }
}
