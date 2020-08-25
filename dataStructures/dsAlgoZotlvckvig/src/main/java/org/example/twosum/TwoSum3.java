package org.example.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class TwoSum3 {

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target =6;
        int[] result = new TwoSum3().twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }

    private int[] twoSum(int[] nums,int target) {

        int[] result = new int[2];
        int left = 0;
        int right = nums.length - 1;

        int[] sortedArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedArray);
        while (left < right) {
            int currentSum = sortedArray[left] + sortedArray[right];
            if (currentSum == target) {

                result[0] = getNthIndex(nums,sortedArray[left],0);

                int complementNumIndex = getNthIndex(nums,sortedArray[right],0);
                result[1] = result[0] == complementNumIndex
                        ? getNthIndex(nums,sortedArray[left],result[0]+1) :
                        complementNumIndex;

                break;
            } else if (currentSum < target) {
                left++;
            } else if (currentSum > target) {
                right--;
            }
        }
        return result;
    }

    private int getNthIndex(int[] arr,int element,int fromIndex){
        if (arr == null) {
            return -1;
        }

        int len = arr.length;
        int i = fromIndex;

        while (i < len) {
            if (arr[i] == element) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
}
