class circle2{
    int radius;
    circle2(){
        System.out.println("This is a non parameterized class of circle");
    }
    // public int getRadius(){
    //     return radius;
    // }

    // public void setRad(int radius){
    //     this.radius = radius;
    // }
    circle2(int r){
        System.out.println("This is a parameterized constructor of circle");
        this.radius = r;
    }
    public double getCircumference(int radius){
        return 2 * Math.PI * radius;
    }
}

class sphere extends circle2{

    // sphere(){
    //     System.out.println("This is a non parameterized constructor of sphere");
    // }
    sphere(int r){
        super(r);
        System.out.println("This is a parameterized constructor of sphere");
        this.radius = r;
    }

    public double getVolume(){
        return (4/3) * Math.PI * radius * radius * radius;
    }

}

public class ch10_practice{
    public static void main(String[] args) {
        // circle2 cr = new circle2(3);
        sphere obj = new sphere(2);
        // cr.setRad(3);
        // System.out.println(cr.getRadius());
        // System.out.println(cr.getCircumference(2));
        // System.out.println(cr.getVolume());
        
    }
}