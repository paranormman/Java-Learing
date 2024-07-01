

class C1{
    public int a = 5;
    protected int b = 6;
    int c = 7;
    private int d = 8;

    public void meth(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class ch12_access_modifier {
    public static void main(String[] args) {
        C1 obj = new C1();
        // obj.meth();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        // System.out.println(obj.d);
    }
}
