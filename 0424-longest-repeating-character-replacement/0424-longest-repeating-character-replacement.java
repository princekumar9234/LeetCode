class Solution {
     int find(int a[]){
            int max = 0;
            for(int i = 0; i< 256; i++){
                 max = Math.max(max, a[i]);
            }
            return max;
        }
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int low = 0, high = 0;
        int res = Integer.MIN_VALUE;
        int arr[] = new int[256];

        for(high = 0; high < n; high++){
               arr[s.charAt(high)]++;

            int maxc =  find(arr);

            int len = high - low + 1;
            int diff = len - maxc;   
            
            while (diff > k) {
                arr[s.charAt(low)]--;
                low++;

                maxc = find(arr);
                len = high - low +1;
                diff = len - maxc;
            }

            len = high - low +1;
            res = Math.max(res, len);
        }
        return res;
    }
}