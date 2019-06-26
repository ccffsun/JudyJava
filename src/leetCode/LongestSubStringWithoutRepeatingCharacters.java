package leetCode;

public class LongestSubStringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        else {
            int l = 0;
            int k = 0;
            int maxLength=Integer.MIN_VALUE;
            char[] a = s.toCharArray();
            int[] count = new int[256];
            for (int i = 0; i < 256; i++) {
                count[i] = 0;
            }
            for (char c : a) {
                count[c]++;
                if (count[c] == 1) {
                    k++;
                    maxLength=Math.max(maxLength,k);
                }
                while (count[c] == 2) {
                    count[a[l]]--;
                    if (count[a[l]] == 0) {
                        k--;
                    }
                    l++;
                }
            }
            return maxLength;
        }
    }
}