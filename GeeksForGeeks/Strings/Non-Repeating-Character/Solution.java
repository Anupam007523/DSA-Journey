class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int[] freq = new int[26];
        
        //counting frequency
        for(int i = 0; i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        //Finding non repeating character
        for(int i = 0;i<s.length();i++){
            if(freq[s.charAt(i) - 'a'] == 1)
            return s.charAt(i);
        }
        return '$';
    }
}
