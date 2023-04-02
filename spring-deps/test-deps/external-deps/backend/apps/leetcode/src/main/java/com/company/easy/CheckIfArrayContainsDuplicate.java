package com.company.easy;

import java.util.HashSet;
import java.util.Arrays;

public class CheckIfArrayContainsDuplicate {
    public static void main(String[] args) {
        CheckIfArrayContainsDuplicate obj = new CheckIfArrayContainsDuplicate();
        int[] arr1 = {1, 2, 3, 1};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(obj.containsDuplicateUsingHashSet(arr1));
        System.out.println(obj.containsDuplicateUsingHashSet(arr2));
        System.out.println(obj.containsDuplicateUsingSorting(arr1));
        System.out.println(obj.containsDuplicateUsingSorting(arr2));
    }

    public boolean containsDuplicateUsingHashSet(int[] nums) {
        boolean flag = false;
        HashSet<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            if (numbers.contains(num)) {
                flag = true;
                break;
            }
            numbers.add(num);
        }
        return flag;
    }

    public boolean containsDuplicateUsingSorting(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

}