class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int num:nums)
        {
            count.put(num,count.getOrDefault(num,0)+1);
        }

        List<Integer>[] bucket = new List[nums.length+1];

        for(int i=0;i<bucket.length;i++)
        {
             bucket[i] = new ArrayList<>();
        }

        for(int num:count.keySet())
        {
            int frequency = count.get(num);
            bucket[frequency].add(num);
        }

        int[] res = new int[k];
        int index = 0;

        for(int i=bucket.length-1;i>=0 && index<k;i--)
        {
             for(int num:bucket[i])
             {
                res[index] = num;
                index++;
                if(index==k) break;
             }
        }
     

       return res;
    }
}
