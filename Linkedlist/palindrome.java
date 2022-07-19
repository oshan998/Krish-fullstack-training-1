package Linkedlist;

public class palindrome {

    static class Nodewrapper{
        public Node node;
        Nodewrapper(Node node){
            this.node=node;
        }
    }

    //function that insert a new node at the begining of the linked list
    public static Node push(Node head,int data){
        Node node=new Node(data);
        node.next=head;
        //new head will be returned.
        return node;
    }

    //recursive function to check if list is a palindrome or not
    public static boolean checkIfPalindrome(Nodewrapper left, Node right){
        if(right==null){
            return true;
        }

        boolean result = checkIfPalindrome(left,right.next)&& (left.node.data==right.data);
        left.node=left.node.next;
        return result;
    }

    //function to check if palindrome or not
    public static boolean checkPalindrome(Node head){
        //wrap head, its reference can change inside checkIfPalindrome
        return checkIfPalindrome(new Nodewrapper(head),head);
    }

    public static void main(String args[]){
        int [] arr={2,4,6,8,6,4,1};
        Node head=null;
        for(int i=arr.length-1;i>=0;i--){
            head=push(head,arr[i]);
        }

        if(checkPalindrome(head)){
            System.out.println("This is a Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }

}
