class Employee {
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

class cellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Call Suresh...");
    }
    
}

class square{
    int side;
    public int area(){
        return side * side;
    }

    public int perimeter(){
        return 4 * side;
    }
}

class rectangle{
    int length;
    int breadth;
    public int rectArea(){
        return length * breadth;
    }

    public int rectPeri(){
        return 4 * (length + breadth);
    }
}

class circle{
    int radius;
    public float circleArea(){
        return 3.14f * (radius * radius);
    }

    public float circlePeri(){
        return 2 * 3.14f * radius;
    }
}

class tommyVicetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Run from the enemy");
    }
    public void fire(){
        System.out.println("firing on the enemy");
    }
}


public class oops_practice {
    public static void main(String[] args) {
        /*
        // Problem 1
        Employee manoj = new Employee();
        manoj.salary = 980;
        System.out.println(manoj.getSalary());
        manoj.setName("Chronovesta");
        System.out.println(manoj.getName());

        // Problem 2
        cellPhone iphone = new cellPhone();
        iphone.ring();
        iphone.vibrate();
        iphone.callFriend();
        
        // Problem 3
        square sq = new square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        
        // Problem 4
        rectangle rect = new rectangle();
        rect.length = 4;
        rect.breadth = 5;
        System.out.println(rect.rectArea());
        System.out.println(rect.rectPeri());

        // problem 5
        circle cir = new circle();
        cir.radius = 4;
        System.out.println(cir.circleArea());
        System.out.println(cir.circlePeri());
        */

        // Problem 5
        tommyVicetti game = new tommyVicetti();
        game.hit();
        game.run();
        game.fire();

    }
}
