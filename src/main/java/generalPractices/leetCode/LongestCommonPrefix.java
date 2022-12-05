package generalPractices.leetCode;


public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower","flowe","flight"};
        System.out.println(longestCommonPrefix(arr));
    }
    /*
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".

    Example 1:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"
     */
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return  "";
        for(int i=0; i<strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            for (String str : strs) {
                if (i == str.length() || str.charAt(i) != ch)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
