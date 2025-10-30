package BinarySearch;

//33. Search in Rotated Sorted Array

public class Rotated_Sorted_Array_1 {
    public static void main(String[] args) {
       int[] nums = {5,1,3};

        System.out.println(search(nums, 5));
    }
    static int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target) return mid;
            else if(nums[left]<=nums[mid]){
                if(nums[left]<=target && nums[mid]>=target) right = mid-1;
                else left = mid+1;
            }
            else{
                if(nums[mid]<=target && target<=nums[right]) left = mid+1;
                else right = mid-1;
            }
        }
        return -1;
    }

}

