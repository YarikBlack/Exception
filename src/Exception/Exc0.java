package Exception;

class Exc0{
    public static void main(String[] args){
        int d = 0;
        int c = 42 / d; // generate Arithmetic exception
        int f = c + d;
        System.out.println(f);
        
    }
}