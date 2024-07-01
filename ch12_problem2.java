package folder.folderL1.folderL2;

class calculator{
    public void calculate(int a, int b){
        System.out.println("The sum of two numbers " + (a+b));
    }
}

class Sccalculator{
    public void calculate(int a, int b){
        System.out.println("The sum of two numbers " + Math.sin(a+b));
    }
}

class Hycalculator{
    public void calculate(int a, int b){
        System.out.println("The sum of two numbers " + Math.sin(a+b));
        System.out.println("The sum of two numbers " + (a+b));
    }
}

public class ch12_problem2 {
    protected int proInt = 10;
    int defint = 25;
    public static void main(String[] args) {
        System.out.println("I am a Method!");
    }
}
