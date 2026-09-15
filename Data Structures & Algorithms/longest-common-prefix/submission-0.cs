public class Solution {
    public string LongestCommonPrefix(string[] strs) {
        if(strs.Length == 0 || strs == null) return "";
        string result = "";
        for(int i=0;i<strs[0].Length;i++)
        {
            char current = strs[0][i];
            for(int j=1;j<strs.Length;j++)
            {
                if(i>= strs[j].Length || strs[j][i] != current)
                {
                    return result;
                }
            }
            result += current;
        }
        return result;
    }
}