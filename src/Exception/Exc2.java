package Exception;

public class Exc2 {
    public static void main(String[] args){
        int d, a;

        try{ // controll block off code
            d = 0;
            a = 42 / d;
            System.out.println(a);
            System.out.println("This doesn't show!");
        } catch (ArithmeticException e) { // catch error division by zero
            System.out.println("Division by zero!");
        } 
        System.out.println("After operator catch.");
    }
}
