package com.duoduo.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @program: LearnAlgorithm
 * @description: 二维数组中的查找
 * @author: 拾光！
 * @create: 2021-05-29 15:18
 */
public class 二维数组中的查找 {

    public static void main(String[] args) {
//         描述：
//         在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
//         每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
// [
//   [1,2,8,9],
//   [2,4,9,12],
//   [4,7,10,13],
//   [6,8,11,15]
// ]给定 target = 7，返回 true。给定 target = 3，返回 false。
        int[][] arr= {{1,2,8,9},{2,4,9,12},{4,7,10,13}};
        Integer target=13;
        Boolean aBoolean = select1(arr, target);
        System.out.println(aBoolean);

    }

    /**
     * 复杂度分析
     * 时间复杂度：O(n^2)，因为最坏情况下，数组中的元素都需要遍历一次。
     * 空间复杂度：O(1)
     * @param arr
     * @param target
     * @return
     */
    public static Boolean select1(int[][] arr, int target){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static Boolean select2(int[][] arr, int target){

        return false;
    }
}
