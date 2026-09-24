class Solution {


    public int isValid(int value)
    {
        int sum=0;
        while(value>0)
        {
            sum+=value%10;
            value/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
      for( int i=0;i<nums.length;i++)
      {
        if(i==isValid(nums[i])) return i;
      }
      return -1;
    }
}