package Array;

public class Solution3 {
    public static void main(String[] args) throws Exception {
        int[] nums = {0,1,0,3,12};
        //int[] nums = {0};

        print(nums);

        moveZeroes(nums);
        print(nums);
    }

    public static void moveZeroes(int[] nums) throws Exception {
        int current_i=0;

        if(nums.length<1 || nums.length>Math.pow(10,4)) {
            throw new Exception("Bad array length.");
        }

        for (int i = 0; i < nums.length; i++) {
            if(i != current_i) {
                nums[current_i] = nums[i];
            }
            if(nums[i] != 0) {
                current_i++;
            }
        }
        while(current_i<nums.length) {
            nums[current_i] = 0;
            current_i++;
        }
    }

    public static void print(int[] nums ) {
        System.out.print('[');
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if(i < nums.length-1) {
                System.out.print(',');
            }
        }
        System.out.println(']');
    }
}
