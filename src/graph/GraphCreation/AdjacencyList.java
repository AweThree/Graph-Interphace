//http://opendatastructures.org/ods-java/12_2_AdjacencyLists_Graph_a.html
package graph.GraphCreation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/*
 * @author Misha
 */
public class AdjacencyList {
    
    List<Integer>[] adj;
    int n;
    public AdjacencyList(int n)
    {
        this.n=n;
        adj=(List<Integer>[]) new List[n];
        for (int i = 0; i < n; i++) 
            adj[i] = new LinkedList<Integer>();
    }
    public void addEdge(int a, int b)
    {
       adj[a].add(b);
       System.out.println("Edge added "+a+" to "+b);
           
    }
    public void removeEdge(int a, int b)  
            /* This takes  $ O(\deg(\ensuremath{\mathtt{i}}))$ time, where  
            $ \deg(\ensuremath{\mathtt{i}})$ (the degree of  $ \ensuremath{\mathtt{i}}$) counts the number 
            of edges in $ E$ that have  $ \ensuremath{\mathtt{i}}$ as their source. */
    {
       Iterator<Integer> it=adj[a].iterator();
       while(it.hasNext())
       {
         if(it.next()==b)
             adj[a].remove(b);
       } 
    }
    
    public boolean hasEdge(int a, int b)
    {
      return adj[a].contains(b);
    
    }
    
    public List<Integer> outEdge(int a)
    {
      return adj[a];
    }
    
    public List<Integer> inEdge(int a)
    {
        ArrayList<Integer> edges= new ArrayList();
       for(int i=0;i<n;i++)
       {
         if(adj[a].contains(i)) 
             edges.add(i);
       }
       return edges;
    }
}  
