package leetCode;

public class MinimunWindowSubstring {
    public String minWindow(String s, String t) {

        int l, i, r, k, left, right, minlength;
        l = i = r = k = left = right = 0;
        minlength = Integer.MAX_VALUE;
        char[] source = s.toCharArray();
        if (t.isEmpty()) {
            char m=source[0];
            String n=Character.toString(m);
            return n;
        }
        else {
            //String to char
            char[] target = t.toCharArray();
            //new count
            int[] counts = new int[256];
            int[] countt = new int[256];
            //init count
            for (int u = 0; u < 256; u++) {
                counts[u] = countt[u] = 0;
            }
            //count target
            for (char c : target) {
                countt[c]++;
                if (countt[c] == 1) {
                    k++;
                }
            }
            //count source
            for (i = 0; i < source.length; i++) {
                counts[source[i]]++;
                if (counts[source[i]] >0 && counts[source[i]] == countt[source[i]]) {
                    r++;
                    while (r == k && i >= l) {
                        minlength=Math.min(minlength,i-l+1);
                        if (i - l + 1 <= minlength) {
                            left = l;
                            right = i+1;//why i+1??
                            //String substring​(int beginIndex, int endIndex)
                            //beginIndex – the beginning index, inclusive.
                            //endIndex – the ending index, exclusive.
                        }
                        counts[source[l]]--;
                        if (counts[source[l]] < countt[source[l]]) {
                            r--;
                        }
                        l++;
                    }
                }
            }
            if (l == 0 && i == source.length) return "";
            else return s.substring(left, right);
        }
    }
}
