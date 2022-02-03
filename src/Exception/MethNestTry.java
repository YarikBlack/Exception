package Exception;

public class MethNestTry {
    static void nesttry(int a){
        try{    
            // Division by zero Exception
            if(a == 1) a = a / (a - a); // division by zero
            // Out of bounds Exception
            if(a == 2){
                int c[] = {1};
                c[99] = 99; // out of bounds Exception
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds Exception: " + e);
        }
    }
    static public void main(String[] args){
        try{
            int a = args.length;
            int b = 42 / a; // if without arguments to command line
                            // division by zero Exception
            System.out.println("a = " + a);
            nesttry(a);
            System.out.println(b);
        } catch(ArithmeticException e){
            System.out.println("Division by zero: " + e);
        }
    }
}
