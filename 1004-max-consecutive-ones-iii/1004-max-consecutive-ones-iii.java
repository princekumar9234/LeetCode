class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[2];
        int max = 0;
        int left = 0;

        for(int right = 0; right < n; right++ ){
            arr[nums[right]]++;

            while(left < n && arr[0] > k){
                arr[nums[left]]--;
                left++;
            }
            int len = right - left + 1;
            max = Math.max(max, len);
        }
        return max;
    }
}