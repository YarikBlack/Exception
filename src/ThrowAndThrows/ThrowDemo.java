package ThrowAndThrows;

public class ThrowDemo {
    static void demoproc(){
        try{
            throw new NullPointerException("Demonstration!");
        } catch (NullPointerException e){
            System.out.println("Exception catch in method demoproc() body.");
            throw e; // generate exception again
        }
    }
    static public void main(String[] args){
        try{
            demoproc();
        } catch(NullPointerException e){
            System.out.println("Retry to catch: " + e);
        }
    }
}
