class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int m=n/2;
        int k=n/2;
        int[] postive = new int[m];
        int[] negtaive = new int[k];
        int[] ans = new int[n];
        int i=0, j=0, x=0;
        for(int num:nums)
        {
            if(num>=0)
            {
                postive[i]=num;
                i++;
            }else{
                negtaive[j]=num;
                j++;
            }
        }
        i=0;
        j=0;
       for(int a=0;a<n;a++)
       {
        if(a%2==0)
        {
            ans[a]=postive[i];
            i++;
        }
        else{
            ans[a]=negtaive[j];
            j++;
        }
       }
       return ans;
    }
}