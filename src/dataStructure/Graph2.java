package dataStructure;

    // Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s.
import java.io.*;
import java.util.*;

    // This class represents a directed graph using adjacency list
// representation
    class Graph2
    {
        private int V;   // No. of vertices
        private LinkedList<Integer> adj[]; //Adjacency Lists

        // Constructor
        Graph2(int v)
        {
            V = v;
            adj = new LinkedList[v];
            for (int i=0; i<v; ++i)
                adj[i] = new LinkedList();
        }

        // Function to add an edge into the graph
        void addEdge(int v,int w)
        {
            adj[v].add(w);
        }

        // prints DFS traversal from a given source s
        void DFS(int s)
        {
            // Mark all the vertices as not visited(By default
            // set as false)
            boolean visited[] = new boolean[V];

            // Create a stack for DFS
            Stack<Integer> stack = new Stack<>();

            // Mark the current node as visited and enqueue it
            visited[s]=true;
            stack.push(s);

            while (stack.size() != 0)
            {
                // pop a vertex from stack and print it
                s = stack.pop();
                System.out.print(s+" ");

                // Get all adjacent vertices of the pop vertex s
                // If a adjacent has not been visited, then mark it
                // visited and push it
                Iterator<Integer> i = adj[s].listIterator();
                while (i.hasNext())
                {
                    int n = i.next();
                    if (!visited[n])
                    {
                        visited[n] = true;
                        stack.push(n);
                    }
                }
            }
        }
    }
