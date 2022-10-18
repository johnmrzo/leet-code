class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = new int[m];
        for (int i = 0; i < m; i++) {
            tmp[i] = nums1[i];
        }
        
        int p1 = 0;
        int p2 = 0;
        
        for (int i = 0; i < m + n; i++) {
            if (p2 >= n || (p1 < m && tmp[p1] <= nums2[p2])) {
                nums1[i] = tmp[p1++];
            } else {
                nums1[i] = nums2[p2++];
            }
        }
    }
}