package design.pattern.singleton;

//This is demonstrate Singleton Design Pattern

public class mainclass {
    public static void main(String[] args){
        singleobject object = singleobject.getInstance();

        object.showMessage();

    }
}