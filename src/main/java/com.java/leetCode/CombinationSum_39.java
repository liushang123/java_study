package com.java.leetCode;

import java.util.*;

public class CombinationSum_39 {
    public static void solve(List<List<Integer>> res,int currentIndex,int count,List<Integer> tmp,int[] candidates,int target){
        if(count>=target) {
            if(count==target)
                res.add(new LinkedList<>(tmp));
            return;
        }

        for(int i = currentIndex;i<candidates.length;i++){
            if(count+candidates[i]>target){
                break;
            }
            tmp.add(candidates[i]);
            solve(res,i,count+candidates[i],tmp,candidates,target);
            tmp.remove(tmp.size()-1);
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        List<Integer> tmp = new LinkedList<>();
        Arrays.sort(candidates);

        solve(res,0,0,tmp,candidates,target);
        return res;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6};
        int ta = 12;
        List<List<Integer>> re = combinationSum(a, ta);
        int b = 1;
    }
}
