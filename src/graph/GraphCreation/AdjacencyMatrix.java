// matrix has useful implementations when the graph is dense and has close to n^2 edges. It improves space efficiency 
// of the data structure. Also 
package graph.GraphCreation;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrix
{
    int matrix[][];
    int n;
    
    public AdjacencyMatrix(int n)
    {
        this.n=n;  
        matrix= new int[n][n];
         for(int i=0;i<n;i++)
         {  for(int j=0;j<n;j++)        
                 matrix[i][j]=0;
             
         }
             
    }
    public void edge()
    {
        for(int i=0;i<n;i++)
            matrix[i][i]=1;
    }
    public void addEdge(int a,int b)
    {
       matrix[a][b]=1;
    
    }
    public void removeEdge(int a, int b)
    {
         matrix[a][b]=0;
    
    }
    public int hasEdge(int a, int b)
    {
       if (matrix[a][b]==1)
           return 1;
       return 0;
    
    }
    
    public List<Integer> inEdge(int a)
    {
        List<Integer> edge = new ArrayList<Integer>();
     for(int i=0;i<n;i++)
     {
       if(matrix[i][a]==1)
           edge.add(i);
     
     }
     return edge;
    }
    public List<Integer> outEdge(int a)
    {
        List<Integer> edge = new ArrayList<Integer>();
     for(int i=0;i<n;i++)
     {
       if(matrix[a][i]==1)
           edge.add(i);
     
     }
     return edge;
    }
            
}


