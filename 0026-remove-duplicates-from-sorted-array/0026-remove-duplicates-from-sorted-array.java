class Solution {
    public int removeDuplicates(int[] nums) {
        int upper = 0;
        int lower = 1;
        int move =1;
        int n = nums.length;
        while(move < n){
            if(nums[move] == nums[move-1]) {
                move++;
                continue;
            }
            nums[upper+1] = nums[move];
            upper++;
            lower++;
            move++;
        }
        return lower;
    }
}