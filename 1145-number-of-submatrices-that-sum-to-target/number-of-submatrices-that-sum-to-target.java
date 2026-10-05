class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;
  
        for(int top = 0 ;top < rows; top++){
            int sum [] = new int[cols];
            for( int bottom = top ;bottom < rows;bottom++){
                for(int col = 0 ;col < cols; col++){
                    sum[col]+=matrix[bottom][col];
                }
                    
                HashMap<Integer, Integer> map= new HashMap<>();
                map.put(0,1);
                int prefixsum = 0;
                for(int col = 0 ;col < cols ;col++){
                    prefixsum+=sum[col];
                    int required = prefixsum - target ;
                    if(map.containsKey(required)){
                        count +=map.get(required);
                    }
                    map.put(prefixsum,map.getOrDefault(prefixsum, 0)+1);
                }

            }
         }
         return count ;
    }
}