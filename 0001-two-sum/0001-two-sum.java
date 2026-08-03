class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a;
        int b;
        int[] arr;
        int i;
        int j;
        for(i=0;i<nums.length;i++){
            a=nums[i];
            for(j=i+1;j<nums.length;j++){
                b=nums[j];
                if(a + b == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}