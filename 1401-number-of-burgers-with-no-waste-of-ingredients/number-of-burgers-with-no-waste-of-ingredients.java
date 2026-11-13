class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        
        if(tomatoSlices % 2 != 0){
            return new ArrayList<>();
        }
        int jumbo = (tomatoSlices - 2 *cheeseSlices )/2;
        int small = cheeseSlices-jumbo;
        if(jumbo < 0 || small < 0){
            return new ArrayList<>();
        }
        ArrayList<Integer > list = new ArrayList<>();
        list.add(jumbo);
        list.add(small);
        return list  ;
    }
}