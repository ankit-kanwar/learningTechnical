package org.example.twosum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum2 {
        public static void main(String[] args) {
            int[] nums = {3,2,4};
            int target =6;
            int[] result = new TwoSum2().twoSum(nums,target);
            System.out.println(Arrays.toString(result));
        }

        private int[] twoSum(int[] nums,int target) {
            var map = new HashMap<Integer, Integer>();
            int[] result = new int[2];
            for (int i = 0; i <= nums.length - 1; i++) {
                int diff = target - nums[i];
                if( map.containsKey(diff) ){
                    result[0] = map.get(diff);
                    result[1] = i;
                }else{
                    map.put(nums[i],i);
                }
            }
            return result;
        }
}
