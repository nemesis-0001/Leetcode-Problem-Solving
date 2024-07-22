class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int res;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        
        int[] nums={1,2,3,4};
        
        int target=7;

        Solution sol = new Solution();

        int[] result =  sol.twoSum(nums,target);

        if(result[0]!=-1 && result[1]!=-1){
            System.out.println("["+result[0]+","+result[1]+"]");
        }
    }
}