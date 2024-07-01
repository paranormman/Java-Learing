class cylinder{
    public int radius;
    public int height;

    public cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    public int getRadius(){
        return radius;
    }
    
    public int getHeight(){
        return height;
    }
    
    public void setRadius(int radius){
        this.radius = radius;
    }
    
    public void setHeight(int height){
        this.height = height;
    }

    public double surfaceArea(){
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
    
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

class rectangle1{
    public int length;
    public int width;
    public int height;

    public rectangle1(){
        this.length = 2;
        this.height = 3;
        this.width = 4;
    }

    public rectangle1(int length, int height, int width){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getHeight(int height){
        return height;
    }
    public int getLength(int length){
        return length;
    }
    public int getWidth(int width){
        return width;
    }

    public int surfaceRectangle(){
        return length * width;
    }
    
    public int volumeRectangle(){
        return length * width * height;
    }
}


public class ch9_practice {
    public static void main(String[] args) {
        /*
        cylinder cir = new cylinder(2, 4);
        // cir.setHeight(10);
        // System.out.println(cir.getHeight());
        // cir.setRadius(15);
        // System.out.println(cir.getRadius());
        System.out.println(cir.surfaceArea());
        System.out.println(cir.volume());
        

        rectangle1 myrectangle = new rectangle1(2, 2, 2);
        System.out.println(myrectangle.surfaceRectangle());
        System.out.println(myrectangle.volumeRectangle());
        rectangle1 r = new rectangle1();
        System.out.println(r.surfaceRectangle());
        System.out.println(r.volumeRectangle());
         
        */
    }
}
