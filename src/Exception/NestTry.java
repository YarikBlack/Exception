package Exception;

public class NestTry {
    public static void main(String[] args){
        try{
            int a = args.length;
            // if we don't set up arguments to command line
            // we recive a Exception because division by zero
            int b = 42 / a;
            System.out.println("a: " + a);
            System.out.println(b);
            try{ // Nested block try
                
                // if arguments of command line equals one
                // we catch exception here
                if(a == 1) a = a / (a - a); // division by zero
                // if arguments of command line equals two
                // we generate array exception out of bounds
                if(a == 2){
                    int c[] = {1};
                    c[42] = 99; // Array out of bounds exception
                }
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index out of Array: " + e);
            }
        } catch(ArithmeticException e){
            System.out.println("Division by zero Exception: " + e);
        }
    }
}
