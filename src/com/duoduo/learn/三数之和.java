package com.duoduo.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: LearnAlgorithm
 * @description: 三数之和
 * @author: 拾光！
 * @create: 2021-05-28 20:37
 */
public class 三数之和 {
    public static void main(String[] args) {
        int[] nums= {-1, 0, 1, 2, -1, -4};
        int target=0;
        List<List<Integer>> list = threeSum1(nums, target);
        System.out.println(list);
    }

    /**
     * 暴力解法
     * @param nums
     * @param target
     * @return
     */
    public static List<List<Integer>> threeSum1(int[] nums,int target){
        int n = nums.length;
        List<List<Integer>> list=new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i+1; j < n - 1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (nums[i]+nums[j]+nums[k]==0){
                       list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        return list;
    }
}
