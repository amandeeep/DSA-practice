package Recursion;
import java.util.*;
public class Combination_Sum_39 {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> check = new ArrayList<>();
        ans(candidates, list, check, target,0);
        return list;
    }
    static void ans(int[] arr, List<List<Integer>> list, List<Integer> check, int target, int i){
        if(i == arr.length){
            if(target == 0){
                list.add(new ArrayList<>(check));
            }
            return;
        }
        if(arr[i]<=target){
            check.add(arr[i]);
            ans(arr, list, check, target-arr[i], i);
            check.removeLast();
        }
        ans(arr, list, check, target, i+1);
    }
}
