package ex2;


public class lambda2 {

    public static void main(String[] args){

        print( (name) -> System.out.println("baw baw!!!"+name) );
    }

    static void print(interface2 one){
        one.bark("hello");
    }
}
