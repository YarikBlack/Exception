package Finally;

public class FinallyDemo {
    // generate Exception in method
    static void procA(){
        try{
            System.out.println("In method procA() body!");
            throw new RuntimeException("Demostarion!");
        } finally{
            System.out.println("Operator finally block in method procA() body!");
        }
    }
    // return control from operator try block
    static void procB(){
        try{
            System.out.println("In method procB() body!");
        } finally{
            System.out.println("Operator finally block in method procB() body!");
        }
    }
    // do block try is regular
    static void procC(){
        try{
            System.out.println("In method procC() body!");
        } finally{
            System.out.println("Operator finally block in method procC() body!");
        }
    }

    public static void main(String[] args){
        try{
            procA();
        } catch (Exception e){
            System.out.println("Exception catched!");
        }
        procB();
        procC();
    }
}
