public class ValidAnagram {
    static public boolean isAnagram(String s, String t) {
        int[] CharacterFrequency = new int[26];
        for (char x : s.toCharArray()) {
            CharacterFrequency[x - 'a']++;
        }
        for (char y : t.toCharArray()) {
            CharacterFrequency[y - 'a']--;
        }
        for (int z : CharacterFrequency) {
            if (z != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram(s,t);
        System.out.println(result);
    }
}
