package Recursion;

import java.util.ArrayList;

public class AllSubsequencs {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;
        ArrayList<Integer> brr = new ArrayList<>();
        subsequence(0,brr, arr,n);
    }
    static void subsequence(int i, ArrayList<Integer> brr, int[] arr, int n){
        if(i==(n)) {
            if (brr.size() == 0) {
                System.out.println("{}");
            } else {
                for (int j : brr) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            return;
        }
        brr.add(arr[i]);
        subsequence(i+1, brr, arr, n);
        //brr.remove(brr.size() - 1);
        brr.removeLast();
        subsequence(i+1, brr, arr,n);
    }
}
