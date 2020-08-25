package org.example.twosum;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target =6;
        int[] result = new TwoSum().twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }

    private int[] twoSum(int[] nums,int target) {
        int[] result = new int[2];
        for(int i=0;i<=nums.length-2;i++){
            for(int j=i+1;j<= nums.length-1;j++){
                if(nums[i]+nums[j] == target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}
