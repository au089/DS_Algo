package ArrayAndHashing;

import java.util.*;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        boolean output = true;

        if (s.length() != t.length()) {
            output = false;
        } else {
            Map<Character, Integer> map1 = new HashMap<>();
            Map<Character, Integer> map2 = new HashMap<>();
            char[] ch1 = s.toCharArray();
            char[] ch2 = t.toCharArray();

            for (char c : ch1) {
                map1.put(c, map1.getOrDefault(c, 0) + 1);
            }

            for (char c : ch2) {
                map2.put(c, map2.getOrDefault(c, 0) + 1);
            }

            if (map1.equals(map2)) {
                return true;
            } else {
                output = false;
            }


        }
        return output;

    }


}
