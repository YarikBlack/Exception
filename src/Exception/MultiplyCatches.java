package Exception;

public class MultiplyCatches {
    public static void main(String[] args){
        try{
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            System.out.println(b);
            int c[] = { 1 };
            c[42] = 99;
        } catch(ArithmeticException e){
            System.out.println("Device by zero: " + e);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Errors array index out of bounds: " + e);
        }
        System.out.println("After operators try and catch!");
    }
}
