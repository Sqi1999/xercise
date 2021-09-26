package com.mybatis.dome.demo.SF;

/**
 * 有人相爱，有人夜里开车看海，有人leetcode第一题都做不出来。
 */
public class Solution {
    public static void main(String[] args) {
        int [] nums={2,6,9,4,5,3,5,6};
        int target=15;
        int[] ints = twoSum(nums, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+" ");
        }
        System.out.println();

    }

    /**
     * int是否为回文
     * 反转之后看看是否和原来的值相同
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {

        if (x<0) return false;
        int i=0;
        int j=x;
        while (j>0){
            i=i*10+j%10;
            j=j/10;
        }
        return i==x;
    }



    public static int[] twoSum(int[] nums, int target) {
        int [] a=new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[i]+nums[j]==target){
                    a[0]=nums[i];
                    a[1]=nums[j];
                    return a;
                }
            }
        }
        return a;
    }

}
