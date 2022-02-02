package Exception;

public class SuperSubCatch {
    public static void main(String[] args){
        try{
            int a = 0;
            int b = 42 / a;
            System.out.println(b);
        } catch (Exception e){
            System.out.println("Catch from supreme class Exception!");
        } 
       // catch(ArithmeticException e){
         //   System.out.println("This is error code. Because is sub clss for Exception!");
        //}
    }
}
