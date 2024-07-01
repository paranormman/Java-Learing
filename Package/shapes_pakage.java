package Package;

import java.lang.Math;

class Rectangle{
    int height;
    int length;
    int breadth;

    public void getheight(int height){
        this.height = height;
    }
    public void getlength(int length){
        this.length = length;
    }
    public void getbreadth(int breadth){
        this.breadth = breadth;
    }
    public int getAreaRectangle(int length, int breadth){
        return length * breadth;
    }
    public int getPerimeterRectangle(int length, int breadth){
        return length + breadth;
    }
    public int getVolumeRectangle(int length, int breadth, int height){
        return length * breadth * height;
    }
}

class Square extends Rectangle{
    public int getAreaSquare(int length){
        return length * length;
    }
    public int getPerimeterSquare(int length){
        return 4 * length;
    }
    public int getVolumeSquare(int length){
        return  length * length * length;
    }
}

class Circle {
    double radius;
    public void setRadius(int radius){
        this.radius = radius;
    }
    public double getAreaCircle(double radius){
        return Math.PI * radius * radius;
    }
    public double getCircumferenceCircle(double radius){
        return 2 * Math.PI * radius;
    }
}

class Sphere extends Circle{
    public double getAreaSphere(double radius){
        return 4 * Math.PI * radius * radius;
    }
    public double getVolumeSphere(double radius){
        return 4 / 3 * Math.PI * (radius * radius * radius);
    }
}

class Cylinder extends Rectangle{
    public double getAreaCylinder(int height, double radius){
        return 2 * Math.PI * radius * (radius + height);
    }
}



public class shapes_pakage {
    public static void main(String[] args) {
        System.out.println("This is a new package for shapes");;
    }
    
}
