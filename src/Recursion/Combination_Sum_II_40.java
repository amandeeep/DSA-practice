package Recursion;
import java.util.*;



public class Combination_Sum_II_40 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(combinationSum2(candidates, target));
    }
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        ans(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }
    static void ans(List<List<Integer>> list, List<Integer> check, int[] arr, int target, int index) {
        if(target == 0){
            list.add(new ArrayList<>(check));
            return;
        }
        for(int i = index; i<arr.length; i++){
            if(i>index && arr[i] == arr[i-1]) continue;
            if(arr[i]>target) break;
            check.add(arr[i]);
            ans(list, check, arr, target-arr[i], i+1);
            check.removeLast();
        }

    }
}

