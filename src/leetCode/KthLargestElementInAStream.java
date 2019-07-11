package leetCode;

public class KthLargestElementInAStream {
    int[] minArray;
    int n=0;
    int length;
    //construct
    public KthLargestElementInAStream(int k, int[] nums) {
        if(nums.length==0) return;
        //bulid the minheap
    buildMinHeap(nums,k);
    //loop for the rest of the array:k+1,k+2,k+3....
        for(int i=0;i<nums.length-k;i++){
           if(nums[0]<nums[k+i]){
               nums[0]=nums[k+i];
               heapifyMin(nums,k,0);
           }
           else continue;
        }
        minArray=nums;
        n=k;
        length=nums.length;
    }
    public int add(int val) {
        /*if(length==0){
            minArray=new int[n];
            minArray[0]=val;
         }
         */

        if(this.minArray[0]<val){
            minArray[0]=val;
            heapifyMin(minArray,n,0);
        }
        return minArray[0];
    }
    public void swap(int[] tree,int i,int j){
        int temp=tree[i];
        tree[i]=tree[j];
        tree[j]=temp;
    }
    public void heapifyMin(int[] tree,int n,int i){
        if(i>=n) return;
        int c1=2*i+1;
        int c2=2*i+2;
        int min=i;
        if(c1<n&&tree[c1]<tree[min]){
            min=c1;
        }
        if(c2<n&&tree[c2]<tree[min]){
            min=c2;
        }
        if(i!=min){
            swap(tree,i,min);
            heapifyMin(tree,n,min);
        }

    }
    public void buildMinHeap(int[] tree,int n){
     int lastNode=(n-1)/2;
     for(int i=lastNode;i>=0;i--){
         heapifyMin(tree,n,i);
     }
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

