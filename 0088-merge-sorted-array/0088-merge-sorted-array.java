class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1,j=nums2.length-1;
        int k=nums1.length-1;

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }else{
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
        
        // for(int i=m+n;i>=0;i--){
        //     for(int j=n;j>=0;j--){
        //         if(nums2[i]>nums2[j]){
        //             nums1[i]=nums2[j];
        //         }
        //         // nums1[i]=nums2[j];
        //     }
        // }
    }
}