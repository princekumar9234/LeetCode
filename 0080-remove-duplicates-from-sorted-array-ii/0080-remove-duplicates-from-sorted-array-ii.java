class Solution {
    public int removeDuplicates(int[] nums) {
     
     int unique = 2;

        for(int i = 2; i<nums.length; i++){
          
         if(nums[i] != nums[unique-2]){
            nums[unique] = nums[i];
            unique++;
         }
        }
        return unique;
    }
}