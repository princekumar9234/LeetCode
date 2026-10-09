class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int duplicate = 0;

        for(int i =0; i<n-1; i++) {
             if(nums[i] == nums[i+1]){
                     duplicate = nums[i];
                    
             }
        }
        return duplicate;
    }
}