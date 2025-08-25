class Solution {
    public void swap(int[] nums, int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int high=n-1;
        int low=0,mid=0;

while(mid<=high)
{
        switch(nums[mid])
        {
           case 0:
           swap(nums,low,mid);
           low++;
           mid++;
           break;
           case 1:
               mid++;
               break;
           case 2:
           swap(nums,mid,high);
           high--;
           break;

        }
}
    }
}