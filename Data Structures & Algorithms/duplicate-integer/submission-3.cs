public class Solution {
    public bool hasDuplicate(int[] nums) {
       HashSet<int> duplicates = new HashSet<int>();
       foreach(int value in nums)
       {
        if(!duplicates.Add(value)) return true;
       }
       return false;
    }
}