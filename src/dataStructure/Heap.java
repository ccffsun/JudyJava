package dataStructure;

public class Heap {
    public void swap(int[]a ,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void heapify(int[] tree ,int n,int i){
        if(i>=n) return;
        int c1=2*i+1;
        int c2=2*i+2;
        int max=i;
        //c1,c2,i which is the max
        if(c1>max&&c1<n){
            max=c1;
        }
        if(c2>max&&c2<n){
            max=c2;
        }
        //swap max and i
        if(i!=max){
            swap(tree,i,max);
        }
        //do the same thing to the max
        heapify(tree,n,max);

    }
    public void buildHeap(int[] tree,int n){
        //find the lastnode to be heapify
        int lastNode=(n-1)/2;
        for(int i=lastNode;i>=0;i--){
            heapify(tree,n,i);
        }
    }
    public void heapSort(int[] tree,int n){
        //build the heap first
        buildHeap(tree,n);
        //put the first node to the last and 'cut' it
        for(int i=n-1;i>=0;i--){
            //first swap the first node and the last node
            swap(tree,i,0);
            //'cut'(n->0) the last node and heapify the tree
            heapify(tree,i,0);
        }
    }
}
