package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfAllSubsets {
    public static void main(String[] args) {
        int[] arr = {5,2,1};
        List<Integer> list = new ArrayList<>();
        ans(arr, list, 0, 0);
        list.sort(null);
        System.out.println(list);
    }
    static void ans(int[] arr, List<Integer>list, int i, int sum){
        if(i == arr.length){
            list.add(sum);
            return;
        }
        ans(arr, list, i+1, sum+arr[i]);
        ans(arr, list, i+1, sum);

    }
}
