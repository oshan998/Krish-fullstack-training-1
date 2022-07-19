package Linkedlist;

//reverse a linked list

public class Linkedlist {
    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int a){
            data=a;
            next=null;
        }
    }

    //this function reverse the linked list
    Node reversefunction(Node node){
        Node previous=null;
        Node current=node;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        node=previous;
        return node;
    }

    //print content of linked list
    void printlinkedlist(Node node){
        while(node!=null){
            System.out.print(node.data + " ");
            node=node.next;
        }
    }

    public static void main(String args[]){
        Linkedlist list=new Linkedlist();
        list.head=new Node(250);
        list.head.next=new Node(300);
        list.head.next.next=new Node(750);
        list.head.next.next.next=new Node(450);
        list.head.next.next.next.next=new Node(950);

        System.out.println("before reverse");
        list.printlinkedlist(head);
        head=list.reversefunction(head);
        System.out.println(" ");
        System.out.println("after reversed");
        list.printlinkedlist(head);
    }

}
