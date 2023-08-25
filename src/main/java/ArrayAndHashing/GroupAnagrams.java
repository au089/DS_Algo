package ArrayAndHashing;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();  //Map<Sorted,List<Anagrams>>
        if (strs.length == 0) {
            return output;
        } else if (strs.length == 1) {
            List<String> list = new ArrayList<>();
            list.add(strs[0]);
            output.add(list);
        } else {
            for (String str : strs) {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String sortedWord = new String(chars);
                if (!map.containsKey(sortedWord)) {
                    map.put(sortedWord, new ArrayList<>());
                }

                map.get(sortedWord).add(str);


            }
            output.addAll(map.values());
        }

        return output;
    }
}
