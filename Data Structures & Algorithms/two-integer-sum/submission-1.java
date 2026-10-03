class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int value = target-nums[i];
            if(mpp.containsKey(value))
            {
                return new int[] {mpp.get(value),i};
            }
            mpp.put(nums[i],i);
        }
        return null;
    }
}
