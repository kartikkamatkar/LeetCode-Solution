class Solution {
    public int findSpecialInteger(int[] arr) {
        //frequency 
        HashMap<Integer , Integer > map = new HashMap<>();
        for(int i : arr ){
            map.put(i,map.getOrDefault(i ,0) + 1);
        }
        int len = arr.length /4;
        int ans = 0;
        for(int i : arr){
             if(map.get(i) > len ){
                ans = i;
                break;
             }
        }
        return ans ;
       
    }
}