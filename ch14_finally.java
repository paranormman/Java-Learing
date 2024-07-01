public class ch14_finally {
    public static int divide(){
        try{
            int a = 50;
            int b = 0;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Cleaning up resources...");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = divide();
        System.out.println(k);
        int a = 99;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am final value of b " + b);
            }
            b--;
        }


        // try{
        // int c = divide(50, 10);
        // System.out.println(c);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // finally{
        //     System.out.println("Cleaning up extra resources...");
        // }
    }
}
