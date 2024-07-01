
class MyThread1 extends Thread{
    public void run(){
        int i = 0;
        while(true){
            System.out.println("This is a Cooking Thread1");
            // Exception method interrupt
            try {
                Thread.sleep(10);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            // System.out.println("I am Hungry!!");
            i++;
        }
    }
}

 
class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i < 50){
            System.out.println("This is a Gaming Thread1");
            // System.out.println("I am Happy!!");
            i++;
        }
    }
}

/*
class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i < 100){
            System.out.println("This is a Thread 1");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i < 100){
            System.out.println("This is a Thread 2 with a change");
            i++;
        }
    }
}

*/

public class ch13_threading {
    public static void main(String[] args) {
        // // Threads by extending the Threads --> inheritance (Threads)
        // MyThread1 t1 = new MyThread1();
        // MyThread2 t2 = new MyThread2();

        // t1.start();
        // t2.start();


        // Threads by interface --> implements (Runnable)
        // MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        // Thread gun1 = new Thread(bullet1);

        // MyThreadRunnable2 bullet2= new MyThreadRunnable2();
        // Thread gun2 = new Thread(bullet2);

        // gun1.start();
        // gun2.start();


        // Using Try catch method to run a single thread completely and then execute other threads.

        MyThread1 t1 = new MyThread1();
        MyThread1 t3 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        // try{
        //     t1.join();
        // }
        // catch(Exception e) {
        //     System.out.println(e);
        // }
        t2.start();
        // t3.start();


    }
}
