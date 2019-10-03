package leetCode;

import java.util.Stack;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String copy=Integer.toString(x);
        if(x<0){
            return false;
        }
        if(x==0) return true;
        String u="";
        while(x>0){
            int y=x%10;
            String c=Integer.toString(y);
            x=x/10;
            u+=c;
        }
        return u.equals(copy);
    }
}
