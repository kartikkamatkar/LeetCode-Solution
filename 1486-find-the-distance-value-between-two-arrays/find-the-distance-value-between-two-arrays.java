class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0 ;
        for(int i : arr1){
            int low = i - d;
            int high = i + d;
            if(check(arr2 , low , high)){
                count++;
            }
        }
        return count ;
    }
    private boolean check(int [] arr1, int low , int high){
        int r  = arr1.length -1;
        int l = 0 ;
        while(l <= r){
            int mid = l +(r-l)/2;
            if(arr1[mid] >= low && arr1[mid]<= high){
                return false;
            }
            else if (arr1[mid] < low){
                l = mid +1;

            }
            else{
                r = mid -1;
            }
        }
        return true ;
    }
}