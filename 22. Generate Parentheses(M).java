/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
 */

/**
 * The idea here is to only add '(' and ')' that we know will guarantee us a solution (instead of adding 1 too many close). 
 * Once we add a '(' we will then discard it and try a ')' which can only close a valid '('. 
 * Each of these steps are recursively called.
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, n, 0, "");
        return list;
    }
    public void backtrack(List<String> list, int left, int right, String str){
        if(left==0 && right==0){
            list.add(str);
            return;
        }
        if(left>0)
            backtrack(list, left-1, right+1, str+"(");
        if(right>0)
            backtrack(list, left, right-1, str+")");
    }
}