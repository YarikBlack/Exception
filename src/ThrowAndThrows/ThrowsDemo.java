package ThrowAndThrows;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessError{
        System.out.println("In method thowsOne() body.");
        throw new IllegalAccessError("Demonstration!");
    }
    public static void main(String[] args){
        try{
            throwOne();
        } catch(IllegalAccessError e){
            System.out.println("Exception catched: " + e);
        }
    }
}
