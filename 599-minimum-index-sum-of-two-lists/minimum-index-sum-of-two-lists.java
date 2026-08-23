class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        int minLen = Integer.MAX_VALUE;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int indexSum = i + map.get(list2[i]);
                if (indexSum < minLen) {
                    minLen = indexSum;
                    list.clear();
                    list.add(list2[i]);
                } else if (minLen == indexSum)
                    list.add(list2[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}