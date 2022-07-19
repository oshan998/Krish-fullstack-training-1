package ex1;

public class lambda1 {

    //what lambda do - instead of sending an object which contains an action, we sending the action here.
    public static void main(String[] args){
        dog d=new dog();
        print( () -> System.out.println("baw baw!!!") );
    }

    static void print(interface1 one){
        one.bark();
    }
}
