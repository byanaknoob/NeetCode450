class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hash_set = new HashSet<Integer> ();
        int maxCount=0;
        for(int i=0;i<nums.length;i++)
        {
            hash_set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
           if(!hash_set.contains(nums[i]-1))
           {
            int count=1;
            while(hash_set.contains(nums[i] + 1))
            {
                nums[i]++;
                count++;
            }
            maxCount=Math.max(maxCount,count);
           }
        }
        return maxCount;
    }
}