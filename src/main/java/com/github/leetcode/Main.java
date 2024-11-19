package com.github.leetcode;

public class Main {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0 };
        int nums2[] = { 2,5,6}; 
        merge(nums1, 3, nums2, 3);

    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i == m+n; i++){
            for(int j = 0; j <= n; j++){
                if(nums1[i] > nums2[j]){
                    nums1[i] = nums1[i]; 
                }

            }    
        }

        for(int i = 0; i <= m+n; i++){
            System.out.print("["+i);
        }
    }
}