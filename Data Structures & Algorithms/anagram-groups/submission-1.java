class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> Deku = new HashMap<>(); 
        for (String s: strs){
            int[] kacchan = new int[26];
            for(char c: s.toCharArray()){
                kacchan[c - 'a']++;
            }
            String key = Arrays.toString(kacchan);
            Deku.putIfAbsent(key, new ArrayList<>());
            Deku.get(key).add(s);
        }
        return new ArrayList<>(Deku.values());
    }
}
