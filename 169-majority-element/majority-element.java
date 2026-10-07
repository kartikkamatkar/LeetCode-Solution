class Solution {
    public int majorityElement(int[] nums) {
    int count =0;
    int can =nums[0];
    for(int i =1;i<nums.length ;i++){
        if(can ==nums[i]){
            count++;
        }
        else if(count ==0){
            can =nums[i];
        }
        else{
            count--;
        }
    }
    return can;
    }
}