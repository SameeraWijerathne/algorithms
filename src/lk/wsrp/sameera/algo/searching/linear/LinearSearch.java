package lk.wsrp.sameera.algo.searching.linear;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {3, 10, -20, 55, 125, -80, 40};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int search = scanner.nextInt();

        for (int i = 0; i < nums.length; i++) {
            if (search == nums[i]) {
                System.out.printf("%s found at: %s", search, i);
                return;
            }
        }
        System.out.println("Not found!");
    }
}
