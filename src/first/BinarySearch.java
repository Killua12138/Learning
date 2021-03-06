package first;

/**
 * 二分查找
 */
public class BinarySearch {
    public static int search(int[] nums,int target){
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi){
            int mid = (lo + hi)/2;
            if (target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                hi = mid - 1;
            }
            else
                lo = mid + 1;
        }
        return -1;
    }
}
