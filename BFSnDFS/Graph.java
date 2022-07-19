package BFSnDFS;
// to find articulation points in graph
import java.util.*;

public class Graph {
    static int time;

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void aputil(ArrayList<ArrayList<Integer>> adj, int u, boolean visited[], int disc[], int low[], int parent, boolean isAP[])
    {
        //chidlren count in DFS
        int chidlren = 0;

        //mark current node as visited
        visited[u]=true;

        //initialize discovery time and low value
        disc[u] = low[u] = ++time;

        //use this for loop to go through all vertices adjacent to this
        for(Integer v: adj.get(u)){
            //if v is not visited then make it a child of u and recur for it
            if(!visited[v]){
                chidlren++;
                aputil(adj, v, visited, disc, low, u, isAP);

                //check if subtree rooted with v has a connection to one of the ancestors of u
                low[u] = Math.min(low[u], low[v]);

                //if u is not root and low value of its child is more than a discovery value of u
                if(parent != -1 && low[v] >= disc[u])
                    isAP[u] = true;
            }
            //update low value of u for parent function calls
            else if(v != parent)
                low[u] = Math.min(low[u], disc[v]);
        }
        //if u is root of DFS tree and has more than 1 child
        if(parent==-1 && chidlren>1)
            isAP[u]=true;
    }

    static void AP(ArrayList<ArrayList<Integer>> adj, int vertices){
        boolean[] visited=new boolean[vertices];
        int[] disc= new int[vertices];
        int[] low = new int[vertices];
        boolean[] isAP = new boolean[vertices];
        int time =0, par=-1;

        //by this loop code works even if the graph is disconnected

        for(int u=0;u<vertices;u++)
        {
            if(visited[u]==false)
                aputil(adj, u, visited, disc, low, par, isAP);
        }

        for(int u=0;u<vertices;u++){
            if(isAP[u]==true)
                System.out.print(u + " ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        int vertices=7;

        ArrayList<ArrayList<Integer>> adj1= new ArrayList<ArrayList<Integer>>(vertices);

        for (int i=0;i<vertices;i++) {
            adj1.add(new ArrayList<Integer>());
        }
            addEdge(adj1, 0,1);
            addEdge(adj1, 1,2);
            addEdge(adj1, 2,0);
            addEdge(adj1, 1,3);
            addEdge(adj1, 1,4);
            addEdge(adj1, 1,6);
            addEdge(adj1, 3,5);
            addEdge(adj1, 4,5);

            System.out.println("Articulation points in graph are ");
            AP(adj1, vertices);

    }
}
