package hash;

public class test1 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));


    }
    public static boolean isAnagram(String s, String t) {
        int record[] = new int[26];  // 定义一个可以存储26位的数组
        // 遍历第一个字符串，（ASCII中，小写字母a~z减去a得到0~25的整数）
        // 记录每个字母出现的次数
        for (int i =0; i < s.length(); i++){
            record[s.charAt(i) - 'a']++;
        }
        // 遍历第二个字符串，如果出现对应字母，减去数组中的记录的次数
        for (int i = 0; i <t.length() ; i++) {
            record[t.charAt(i) - 'a']--;
        }
        // 遍历数组，如果都为空，则为true
        for (int count: record) {
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
