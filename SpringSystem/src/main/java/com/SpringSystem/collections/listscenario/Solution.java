package com.SpringSystem.collections.listscenario;

    import java.util.*;

    public class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);

            for (int i = 0; i < nums.length - 2; i++) {
                // Skip duplicates for i
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];

                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        // Skip duplicates for left and right
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < 0) {
                        left++;  // Need a larger number
                    } else {
                        right--; // Need a smaller number
                    }
                }
            }
            return result;
        }

        public static void main(String[] args) {
            Solution sol = new Solution();

            int[] num1 = {-1, 0, 1, 2, -1, -4};
            System.out.println("Input: " + Arrays.toString(num1));
            System.out.println("Output: " + sol.threeSum(num1));

            int[] num2 = {0, 1, 1};
            System.out.println("Input: " + Arrays.toString(num2));
            System.out.println("Output: " + sol.threeSum(num2));

            int[] num3 = {0, 0, 0};
            System.out.println("Input: " + Arrays.toString(num3));
            System.out.println("Output: " + sol.threeSum(num3));
        }
    }
