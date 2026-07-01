class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     HashMap<Character, Integer> m = new HashMap<>();   
     for(int i = 0; i < magazine.length(); i++){
        char c= magazine.charAt(i);
        m.put(c, m.getOrDefault(c, 0) + 1);
     }
     for(int i = 0; i < ransomNote.length(); i++){
        char c = ransomNote.charAt(i);
        if(m.getOrDefault(c, 0) != 0)
        m.put(c, m.get(c) - 1);
        else
        return false;
     }
     return true;
    }
}