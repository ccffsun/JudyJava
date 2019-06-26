package dataStructure;


//{1,3,4,3,4,5,6,1}
public class Sort {
    /* public void sort1(int []a) {
         int i;
         int j;
         int v;
         int k = 0;
         int min = Integer.MAX_VALUE;
         for (v = 0; v < a.length; v++) {
             for (i = v; i < a.length; i++) {
                 if (a[i] <= min) {
                     k = i;
                     min =a[k];
                 }
             }
             for (j = k ; j > v; j--) {//j=k k要倍覆盖  j>v 不是大于0
                 a[j] = a[j - 1];
             }
             a[v] = min; //a[v]=a[k]  a[k]此时已被覆盖，因为上面的for循环
             min=Integer.MAX_VALUE;//每次刷新min
         }
     }

     */
    public void sort2(int[] a) {
        int i;
        int j;
        int v;
        int k = 0;
        int temp;
        int min = Integer.MAX_VALUE;
        for (v = 0; v < a.length; v++) {
            for (i = v; i < a.length; i++) {
                if (a[i] <= min) {
                    k = i;
                    min = a[k];
                }
            }
            temp=a[v];
            a[v]=min;
            a[k]=temp;
            min = Integer.MAX_VALUE;//每次刷新min
        }
    }
}