package leetCode;

public class ReverseString {
    public void reverseString(char[] s) {
        reverseHelp(s,0,s.length-1) ;
    }

    public void reverseHelp(char[] s, int left, int right){
        if (s==null) return;
        if( right<=left) return;
        char temp=s[left];
        s[left++]=s[right];
        s[right--]=temp;
        reverseHelp(s,left,right);
    }
}
