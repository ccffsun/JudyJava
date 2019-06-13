package leetCode;


//put all the 0 before other elements in an array
//slow and fast
//when there are 3 kinds of elements in the array , see the leetcode 75-------sort ccolors

public class Move0AheadOfArray {
    public int [] move0Ahead(int [] a){
        int s =0;
        for(int f=0;f<a.length;f++){
            if (a[f]==0){
                int temp =a[f];
                a[f]=a[s];
                a[s]=temp;
                s++;
            }
        }
        return a;
    }


    public int [] move0AheadII(int [] a) {
        int s = 0;
        int f = 0;
        if (a.length == 1) {
            return a;
        } else {
            while (f < a.length) {
                if (a[f] == 0) {
                    int temp = a[f];
                    a[f] = a[s];
                    a[s] = temp;
                    f++;
                    s++;
                } else f++;
            }
            return a;
        }
    }



}

