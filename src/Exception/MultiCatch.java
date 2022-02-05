package Exception;

public class MultiCatch {
    public static void main(String[] args){
        int a = 10, b = 0;
        int vals[] = {1, 2, 3};

        try{
            int result = a / b; // generate ArithmeticException

            vals[10] = 19; // generate IndexOutOfBoundsException
            System.out.println(result);
            // in this opetator catch we looking for two exception
        } catch (ArithmeticException | IndexOutOfBoundsException e){
            System.out.println("Exception catched: " + e);
        }
        System.out.println("After Multi Catch!");
    }
}
