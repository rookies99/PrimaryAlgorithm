import java.util.HashMap;
import java.util.Map;

public class _242_有效的字母异位词 {
    static class  Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            /*
            1.哈希表做法，使用哈希表存储每个字母出现的次数，
            遍历两个字符，统计每个字符的次数，最后比较l两个哈希表是否相等即可
             */
            Map<String,Integer> hashMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                if (hashMap.containsKey(c)) {
                    hashMap.put(String.valueOf(c), 1);
                }
            }
            return false;
            /*
            2.数组：使用26个字母长度的数组
             */
//            char[] letters = new char[26];
//            System.out.println(letters);
//            letters[0]++;
//            System.out.println(letters);
//            for (int i = 0; i < s.length(); i++) {
//                letters[s.charAt(i)-'a']++;
//                System.out.println(letters);
//            }
//            for (int i = 0; i < t.length(); i++) {
//                letters[t.charAt(i) - 'a']--;
//                System.out.println(letters);
//            }
//            System.out.println("结果");
//            for (char letter : letters) {
//                System.out.println(letter);
//            }
//            return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("gramana", "anagram"));
    }
}
