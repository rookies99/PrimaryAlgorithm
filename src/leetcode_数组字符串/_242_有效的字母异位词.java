package leetcode_数组字符串;

import java.util.HashMap;
import java.util.Map;

public class _242_有效的字母异位词 {
    static class  Solution {
        public boolean isAnagram(String s, String t) {
            // 直接判断 长度不相等肯定不是异位词
            if (s.length() != t.length()) {
                return false;
            }
            /*
            1.哈希表:使用哈希表存储每个字母出现的次数，
            遍历哈希表的value 来进行判断是否相等。哈希表支持Unicode编码
             */
            Map<Character,Integer> hashMap = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                // 循环数组长度，添加到map
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);
                hashMap.put(sChar, hashMap.getOrDefault(sChar, 0) + 1);
                hashMap.put(tChar, hashMap.getOrDefault(tChar, 0) - 1);
            }
            for (Integer value : hashMap.values()) {
                if (value < 0) {
                    return false;
                }
            }

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

            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("大区的", "区大的"));
    }
}
