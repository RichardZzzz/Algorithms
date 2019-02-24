/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Input: "Hello World"
Output: 5
 */

class Solution {
    public int lengthOfLastWord(String s) {
        if(s.trim().equals(""))
            return 0;
        
        char[] SArray = s.trim().toCharArray();
        int len = SArray.length;
        for(int i=len-1;i>0;i--){
            if(SArray[i] == ' ')
                return len-i-1;
        }
        return len;
    }
}