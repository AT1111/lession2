package Array;

import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) throws Exception {
        int[] nums = {0,1,0,3,12};
        //int[] nums = {0};

        System.out.println(Arrays.toString(nums));

        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) throws Exception {
        int index = 0;
        final double MAX_ALLOWED_VALUE = Math.pow(10,4);

        if(nums.length < 1 || nums.length > MAX_ALLOWED_VALUE) {
            throw new Exception("Bad array length.");
        }

        for (int i = 0; i < nums.length; i++) {
            if(i != index) {
                nums[index] = nums[i];
            }
            if(nums[i] != 0) {
                index++;
            }
        }
        while(index<nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
