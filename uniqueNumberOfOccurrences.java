class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> occurrencesMap = new HashMap<>();
        for (int num : arr) {
            occurrencesMap.put(num, occurrencesMap.getOrDefault(num, 0) + 1);
        }
         Set<Integer> occurrenceSet = new HashSet<>();
        for (int occurrences : occurrencesMap.values()) {
            if (!occurrenceSet.add(occurrences)) {
                return false; // Duplicate occurrences found
            }
        }
        return true; 

    }
}
