package com.wust.mmall;

import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num = new int[nums1.length+nums2.length];
        int k=0;
        System.out.println(nums1[0]);
        for (int i=0,j=0;i<nums1.length||j<nums2.length;){
            if (nums1[i]>nums2[j]){
                num[k++] = nums2[j++];
            }else {
                num[k++] = nums1[i++];
            }
        }
        int l= num.length;
        if (l%2==0){
            return (num[l/2]+num[l/2-1])/2;
        }else {
            return num[l/2];
        }
    }

    @Test
    public void test(String[] args) {
        int[] num1 = new int[]{1,3};
        int[] num2 = new int[]{2};
        System.out.println(findMedianSortedArrays(num1,num2));
    }
}
