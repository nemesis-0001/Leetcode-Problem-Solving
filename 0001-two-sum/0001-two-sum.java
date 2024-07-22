class Solution {
    public int[] twoSum(int[] nums, int target) {
                      Map<Integer,Integer> comps = new HashMap<>();

            for(int i=0;i<nums.length;i++){
                Integer comp = comps.get(nums[i]);
                if(comp != null){
                    return new int[] {i,comp};
                }
                comps.put(target-nums[i],i);
            }

            return new int[]{};
    }
}