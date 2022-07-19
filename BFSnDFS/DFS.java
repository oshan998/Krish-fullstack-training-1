package BFSnDFS;
import java.io.*;
import java.util.*;

public class DFS {

    private int vertices; //no. of vertices
    private LinkedList<Integer> adjlist[]; //list for adjacent list

    //constructor
    DFS(int v){
        vertices=v;
        adjlist=new LinkedList[v];
        for(int i=0;i<v;i++){
            adjlist[i]=new LinkedList();
        }
    }

    //function to add edge into graph(DFS)
    void addEdge(int v,int w){
        adjlist[v].add(w); //add w to v's list
    }

    //this below function is use by DFS
    void DFSutil(int v, boolean visited[]){
        //mark current node as visited and print it
        visited[v]=true;
        System.out.print(v + " ");

        //do this for all the verices adjacent to this vertex
        Iterator<Integer> i = adjlist[v].listIterator();
        while(i.hasNext()){
            int n=i.next();
            if(!visited[n])
                DFSutil(n,visited);
        }
    }

    //function to do DFS. use recursive DFSutil()
    void DFS(int v){

        //mark all vertices as non visited. default value set false
        boolean visited[] = new boolean[vertices];

        //call recursive function to print DFS
        DFSutil(v, visited);
    }

    public static void main(String args[]){
        DFS d=new DFS(4);

        d.addEdge(2,0);
        d.addEdge(0,2);
        d.addEdge(1,2);
        d.addEdge(0,1);
        d.addEdge(3,3);
        d.addEdge(1,3);

        System.out.println("following is DFS starting from vertex 2");

        d.DFS(2);
    }

}
