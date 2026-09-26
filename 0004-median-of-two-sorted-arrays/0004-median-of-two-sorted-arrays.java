class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int merge[] = new int [ m + n];
        int k = 0;
       
       for(int i = 0; i < m; i++){
        merge[k++] = nums1[i];
        // k++;
       }
       for(int i = 0; i < n; i++){
        merge[k++] = nums2[i];
        // k++;
       }

       Arrays.sort(merge);

       int total = merge.length;

       if(total % 2 == 1){
        return (double) merge[total / 2];
       }
       else {
        int len1 = merge[total / 2 - 1 ];
        int len2 = merge[total / 2 ];
        return ((double) len1 + (double) len2) / 2.0;
       }
    }
}