class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums)
        {
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        while(min!=0 && max!=0){
            if(min>max) min=min%max;
            else max=max%min;
        }
        if(min==0) return max;
        else return min;
    }
}