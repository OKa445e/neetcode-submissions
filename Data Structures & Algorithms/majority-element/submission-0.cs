public class Solution {
    public int MajorityElement(int[] nums) {
    int count = 0;
    int ans = int.MinValue;
    for(int i=0;i<nums.Length;i++)
    {
        if(count == 0)
        {
            count = 1;
            ans = nums[i];
          
        }
        else if(nums[i] == ans)
        {
            count++;
        }        
        else
        {
            count--;
        }
    }
    int count2 = 0;
    for(int i=0;i<nums.Length;i++)
    {
        if(nums[i] == ans) count2++;
        if(count2 > (nums.Length/2)) return nums[i];
    }
    return -1;

   }
}