import java.util.Arrays;

// Given a zero-based permutation nums (0-indexed), build an array ans of the same length 
// where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
// Input: nums = [0,2,1,5,3,4]
// Output: [0,1,2,4,5,3]
// A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

public class task4 {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int ans [] = new int[nums.length];
        for (int i = 0; i<nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans)); 
    }
}
