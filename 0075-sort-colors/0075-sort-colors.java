class Solution {
    public void sortColors(int[] nums) {

        int i=0,j=0,k=nums.length-1;

        while(j<=k){
            if(nums[j]==0){
                swap(nums,i++,j++);
            }
            else if(nums[j]==1){
                j++;
            }else{
                swap(nums,j,k--);
            }
        }


        // for(int i=0;i<=nums.length-2;i++){
        //     int min=i;
        //     for(int j=i+1;j<=nums.length-1;j++){
        //         if(nums[j]<nums[min]){
        //             min=j;
        //         }
        //     }
        //     int temp=nums[i];
        //     nums[i]=nums[min];
        //     nums[min]=temp;
            
        // }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}