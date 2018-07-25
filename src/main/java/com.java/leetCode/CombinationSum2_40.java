package com.java.leetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum2_40 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        List<Integer> tmp = new LinkedList<>();
        Arrays.sort(candidates);

        solve(res,target,0,0,tmp,candidates);
        return res;
    }

    public static void solve(List<List<Integer>> res,int target,int count,int index,List<Integer> tmp,int[] candidates) {
        if (count >= target) {
            if(count==target)
                res.add(new LinkedList<>(tmp));
            return;
        }
        for(int i = index;i<candidates.length;i++) {
            if (count + candidates[i] > target) {
                break;
            }
            tmp.add(candidates[i]);
            solve(res,target,count+candidates[i],i+1,tmp,candidates);
            tmp.remove(tmp.size() - 1);
            while(i < candidates.length-1 && candidates[i] == candidates[i+1]){
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 1, 2, 7, 6, 1, 5};
        int ta = 8;
        List<List<Integer>> re = combinationSum2(a, ta);
        int b = 1;
    }


}
