class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int start = 0;
        int result = 0;
        int count = 1;
        
     if( k <= 1){
        return 0;
     }
        for (int i = 0; i <nums.length; i++){
          count  = count*nums[i];

          while(count >= k){
            count = count /nums[start];
            start++;
          }
          result = result + i - start +1;
        }
        return result;
    }
}