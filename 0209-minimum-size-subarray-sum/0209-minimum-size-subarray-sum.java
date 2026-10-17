class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0; 
        int result = Integer.MAX_VALUE;
        
    // Code : 1

        // for (int i = 0; i < n; i++) {
        //     sum = sum + nums[i];

        //     while(sum  >= target) {
        //         minLength = Math.min(minLength, i - low +1);
        //         sum = sum - nums[low];
        //         low++;
        //     }
        // }
        // return (minLength == Integer.MAX_VALUE) ? 0 : minLength;


// Code : 2

         while ( high < n) {
          sum = sum + nums[high];

          while( sum >= target) {
            minLength = high - low + 1;
              result = Math.min(result,minLength);
              sum = sum - nums[low];
              low++;
          }
          high++;
        }
        return  result == Integer.MAX_VALUE ? 0 : result;
    }
}