package BFSnDFS;
import java.util.*;

public class BFS {
    private int vertices; //No. of vertices
    private LinkedList<Integer> adjlist[]; //adjacent list

    BFS(int v) //create a constructor (BFS=graph)
    {
        vertices=v;
        adjlist = new LinkedList[v];
        for(int i=0;i<v;++i){
            adjlist[i]=new LinkedList();
        }
    }

    //function to add edge into the graph
    void addedge(int v,int w){
        adjlist[v].add(w);
    }

    //print bfs transversal from a given source s
    void breadthfirstsearch(int s)
    {
        //mark all vertices as not visited. by default in boolean
        //it is set as false. therefore vertices not visited
        boolean visited[] = new boolean[vertices];

        //create a queue data structure for BFS
        //queue used here because of FIFO
        LinkedList<Integer> queue = new LinkedList<Integer>();

        //mark current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);

        while(queue.size() !=0){

            //dequeue a vertex from the queue and print it
            s=queue.poll();
            System.out.print(s+" ");

            //get all adjacent vertices of dequeued vertex s
            //make is visted and enqueue it if an adjacent vertex not visited
            Iterator<Integer> i = adjlist[s].listIterator();
            while(i.hasNext()){
                int n=i.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]){
        BFS b = new BFS(4);

        b.addedge(0,1);
        b.addedge(0,2);
        b.addedge(1,2);
        b.addedge(2,0);
        b.addedge(2,3);
        b.addedge(3,3);


        System.out.println("Following is BFS stating from vertex 1");

        b.breadthfirstsearch(1);
    }

}
