class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int newArray[] = new int[m+n];
        int idx = 0;

        while(i < m && j < n ){
            if(nums1[i] <= nums2[j]){
                 newArray[idx] = nums1[i];
                 idx++;
                 i++;
            } 
            else{
                newArray[idx] = nums2[j];
                idx++;
                j++;
            }
        }
        
        while( j < n ) {
            newArray[idx] = nums2[j];
            j++;
            idx++;
        }
         while ( i < m ) {
            newArray[idx] =nums1[i];
            idx++;
            i++;
         }

        for (int k = 0; k < m + n; k++) {
            nums1[k] = newArray[k];
        }
    }
}