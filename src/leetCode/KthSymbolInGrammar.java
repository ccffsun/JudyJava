package leetCode;

public class KthSymbolInGrammar {
    public int kthGrammar(int N, int K) {
        if(N==0) return 0;
        /*
        if k%2==0  when f(N,K)==1 ,f(N-1, (K+1)/2)==0
                   when f(N,K)==0 ,f(N-1, (K+1)/2)==1

           K%2!=0  when f(N,K)==1 ,f(N-1, (K+1)/2)==1
                   when f(N,K)==0 ,f(N-1, (K+1)/2)==0

        */

        int result=kthGrammar(N-1,(K+1)/2);
        if(K%2==0){
            result=result==1? 0:1;
        /*
        int prev=kthGrammar(N-1,(K+1)/2);
        int result;
        if(K%2==0){    //k even  ,result is diff from prev; k odd result is same as prev
        result=prev==1? 0:1;
         }else{
         result=prev;
         }
        return result;
         */
        }
        return result;
    }

}
