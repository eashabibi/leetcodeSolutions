class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Convert the HashMap to a List of Map.Entry<Integer, Integer>
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());

        // Sort the list based on the value (frequency) of the entries
        list.sort(Map.Entry.comparingByValue());

        int ans = map.size();
        for (Map.Entry<Integer, Integer> entry : list) {
            if (entry.getValue() <= k) {
                k -= entry.getValue();
                ans--;
            } else {
                break;
            }
        }
        return ans;
    }
}
