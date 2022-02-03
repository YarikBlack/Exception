package MyException;

public class ExceptionDemo {
    static void compute(int a) throws MyException{
        System.out.println("Call a method compute(" + a + ")");
        if (a > 10){
            throw new MyException(a);
        }
        System.out.println("Normal end of program!");
    }
    public static void main(String[] args){
        try{
            compute(1);
            compute(11);
        } catch ( MyException e){
            System.out.println("Catched Exception: " + e);
        }
    }
}
