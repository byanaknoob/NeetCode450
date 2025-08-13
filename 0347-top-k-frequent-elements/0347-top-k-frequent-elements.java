class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        int[] result = new int[k];
        for(int i=0;i<nums.length;i++)
        {
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] count= new ArrayList[nums.length+1];
        for(int num:freqMap.keySet())
        {
            int freq=freqMap.get(num);
            if(count[freq]==null)
            {
                count[freq]= new ArrayList<>();
            }
            count[freq].add(num);
        }
        int index=0;
        for(int i=count.length-1;i>=0 && index<k;i--)
        {
            if(count[i]!=null)
           {
            for(int num:count[i])
            {
                result[index]=num;
                index++;
            }
           }
        }
        return result;

    }
}