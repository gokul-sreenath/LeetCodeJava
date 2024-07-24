class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i=m;i<m+n;i++)
        {
            nums1[i] = nums2[i-m];
        }
        for(int j=0;j<nums1.length;j++)
        {
            for(int k=0;k<nums1.length-j-1;k++)
            {
                if(nums1[k]>nums1[k+1])
                {
                    int temp = nums1[k];
                    nums1[k]=nums1[k+1];
                    nums1[k+1]=temp;
                }
                

            }
        }
        
    }
}