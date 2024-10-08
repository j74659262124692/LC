class Solution {
     public int numJewelsInStones(String jewels, String stones) {
            Set<Character> jewelsSet = new HashSet<>();
            Map<Character, Integer> stonesToCount = new HashMap<>();
            for (char c : jewels.toCharArray()) {
                jewelsSet.add(c);
            }
            for (char c: stones.toCharArray()) {
                stonesToCount.put(c, stonesToCount.getOrDefault(c, 0) + 1);
            }
            
            int sum = 0;
            for (char c : jewelsSet) {
                sum += stonesToCount.getOrDefault(c, 0);
            }
            
            return sum;
        }
}