class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       HashMap <Integer , Integer > map = new HashMap<>();
       map.put(0,1);
       int prefixsum = 0;
       int currsum = 0;
       for( int i = 0 ;i< nums.length ;i++){
        if(nums[i]%2!= 0){
            prefixsum++;
        }
        if(map.containsKey(prefixsum-k)){
            currsum += map.get(prefixsum-k);
        }
        map.put(prefixsum ,map.getOrDefault(prefixsum,0)+1);
       }
       return currsum;
    }
}