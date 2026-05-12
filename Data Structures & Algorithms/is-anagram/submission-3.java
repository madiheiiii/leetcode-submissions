class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        boolean result = true;


        if (s.length() != t.length()){
            result = false;
            return result;
        }
        else {
            for(int i = 0; i < s.length(); i++){
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            }
            for(int i = 0; i<t.length(); i++){
                if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i))>0){
                    map.put(t.charAt(i), map.get(t.charAt(i))-1);
               }
               else result = false;
            }
        }
        return result;
    }
}
