package selfTest;
// 有效的同母异位词（判断两个字符串是否字母相同字母的顺序不同）
public class test16 {
    public boolean isAnagram(String s, String t) {
        // 这里的数组长度应该为26个字母的长度，不能是任何一个字符串的长度
        int[] res= new int[26];
        for (int i = 0; i < s.length(); i++) {
            res[s.charAt(i) - 'a']++;
        }
        // 这里分开统计，如果第一个数组长度小于第二个数组就可以识别出来
        for (int i = 0; i < t.length(); i++) {
            res[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < res.length ; i++) {
            if (res[i] != 0){
                return false;
            }
        }
        return true;
    }
}
