package dataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Graph {
    private int V;//the number of vertex
    private LinkedList<Integer> adj[];//constructor: LinkedList(collection<?extend E>C)
    Graph(int v){
        V=v;
        adj=new LinkedList[v];//fill the constructor :the size of the array is v;
        for(int i=0;i<v;i++){ //use every array element to build a LinkedList ,THE
            // ELEMENT IS THE NAME OF THE LINKEDLIST
            adj[i]=new LinkedList<>();
        }
    }
    void addEdge(int v,int w){
        adj[v].add(w); //adj[v] : which linkedList ?  add(w):add what in this linkedList
    }

    void BFS(int s){
        boolean  visited[] =new boolean[V];
        LinkedList<Integer> queue= new LinkedList<>();
        visited[s]=true;
        queue.add(s);
        while (queue.size()!=0){
            s=queue.poll();
            System.out.print(s+ " ");
            ListIterator<Integer> i= adj[s].listIterator();
            while(i.hasNext()){
                int n=i.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }
}
