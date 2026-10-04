class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int[] res = new int[k];
       HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
       for(int num:nums)
       {
           count.put(num,count.getOrDefault(num,0)+1);
       }
       Queue<Integer> minHeap = new PriorityQueue<>((a,b) -> count.get(a)-count.get(b));

       for(int key:count.keySet())
       {
          minHeap.add(key);
          if(minHeap.size()>k)
          {
            minHeap.poll();
          }
       }

       for(int i=0;i<k;i++)
       {
         res[i] = minHeap.poll();
       }
       return res;
    }
}
