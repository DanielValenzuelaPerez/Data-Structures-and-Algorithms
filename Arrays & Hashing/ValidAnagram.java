import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> s_map = new HashMap<>();
        HashMap<Character, Integer> t_map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (s_map.containsKey(s.charAt(i)))
                s_map.put(s.charAt(i), s_map.get(s.charAt(i)) + 1);
            else
                s_map.put(s.charAt(i), 1);

            if (t_map.containsKey(t.charAt(i)))
                t_map.put(t.charAt(i), t_map.get(t.charAt(i)) + 1);
            else
                t_map.put(t.charAt(i), 1);
        }

        return t_map.equals(s_map);
    }
}