package Exception;

public class ChainDemo {
    static void demoproc(){

        // create Exception
        NullPointerException e = new NullPointerException("Hight level!");

        // add reason to Exception
        e.initCause(new ArithmeticException("reason"));
        
        throw e;
    }
    static public void main(String[] args){
        try{
            demoproc();
        } catch(NullPointerException e){
            // Output Exception of hight level
            System.out.println("Catched Exception: " + e);

            // Output a reason for hight level Exception
            System.out.println("Reason: " + e.getCause());
        }
    }
}
