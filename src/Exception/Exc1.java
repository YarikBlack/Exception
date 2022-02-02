package Exception;

public class Exc1 {
    static void subroutine(){
        int d = 0;
        int a = 10 / d; // generate ArithmeticException

        System.out.println(a);
    }
    public static void main(String[] args){
        Exc1.subroutine(); // generate ArihmeticException
    }
}
