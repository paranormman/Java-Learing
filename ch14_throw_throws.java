class NegativeInputException extends Exception{
    @Override
    public String toString(){
        return "Radius can not be negative";
    }

    @Override
    public String getMessage() {
        return  "Radius can not be negative";
    }
}

class zeroInputException extends Exception{
    @Override
    public String toString(){
        return "Radius can not be Zero";
    }

    @Override
    public String getMessage() {
        return  "Radius can not be Zero";
    }
}

public class ch14_throw_throws {

    public static double area(int r) throws NegativeInputException, zeroInputException{
        if(r < 0){
            throw new NegativeInputException();
        }
        if(r == 0){
            throw new zeroInputException();
        }
        else{
        double result = Math.PI * r * r;
        return result;
        }
    }

    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
        int div = divide(10, 0);
        System.out.println(div);
        }
        catch(Exception e){
            System.out.println("Arithmetic Exception");
        }

        try{
            double ar = area(-1);
            System.out.println(ar);
        }
        catch(NegativeInputException e){
            // System.out.println("NegativeInputException");
            System.out.println(e);
        } 
        catch (zeroInputException e) {
            System.out.println(e);
        }
    }
}
