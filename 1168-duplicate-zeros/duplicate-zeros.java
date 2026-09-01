class Solution {
    public void duplicateZeros(int[] nums) {
       int arr[]=new int [nums.length];
       int j = 0;
       for(int i = 0;i < nums.length ;i++ ){
        if(nums[i] == 0 && j!=arr.length)
        {
            arr[j] = nums[i];
            j++;
            if(j!= arr.length){
            arr[j] = 0;
            j++;
            }
        }
        else if(j!= arr.length){
            
            arr[j] = nums [i];
            j++;
        }
       }
       for(int i = 0;i < nums.length; i++){
        nums[i]=arr[i];
       }

    }
}