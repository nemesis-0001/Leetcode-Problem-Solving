class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        // int dup=nums[i];
        for(int j=1;j<nums.length;j++){
            // for()
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}