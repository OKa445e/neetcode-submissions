class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int sufix = 1;
        int prefix = 1;

        for(int i=0;i<n;i++)
        {
            res[i] = prefix;
            prefix = prefix * nums[i];
        }

        for(int i=n-1;i>=0;i--)
        {
            res[i] = res[i] * sufix;
            sufix = sufix * nums[i];
        }
        return res;
    }
}  
