package com.duoduo.learn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: LearnAlgorithm
 * @description: 两数之和
 * @author: 拾光！
 * @create: 2021-05-28 20:07
 */
public class 两数之和 {
    public static void main(String[] args) {
        int[] nums= {2, 7, 11, 15 };
        int target=9;
        int[] ints = twoSum3(nums, target);
        System.out.println(Arrays.toString(ints));

    }

    /**
     * 暴力解法
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    /**
     * 两遍哈希表
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums,int target){
        // {2, 7, 11, 15 };
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[] {map.get(target - nums[i]), i};
            }else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    /**
     * 一遍哈希表
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum3(int[] nums,int target){
        // {2, 7, 11, 15 };
        Map<Integer, Integer> map = new HashMap<>();
        for( int i = 0; i < nums.length; i++ ){
            int thatNum = target - nums[i];
            if( map.containsKey(thatNum) && map.get(thatNum) != i ) {
                return new int[] {map.get(thatNum), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
