class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
     
    public void run(){
        int i = 0;
        while(i < 100){
            System.out.println("this is a Thread "+ this.getName());
            i++;
            }
        }
}



// class newMyrun extends Thread{
//     public newMyrun(Runnable r, String name){
//         super(r, name);
//     }
// }

// class newSpeed implements Runnable{
//     public void run(){
//         System.out.println("This is a thread");
//     }

    // @Override
    // public void run(){
    //     System.out.println("This is a overrided method from other class");
    //     System.out.println("This is a runnable method");
    // }
// }



public class ch13_thread_constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("data1(Low)");
        MyThr t2 = new MyThr("data2");
        MyThr t3 = new MyThr("data3");
        MyThr t4 = new MyThr("data4");
        MyThr t5 = new MyThr("data5(High Importance)");
        // t1.setPriority(Thread.MIN_PRIORITY);
        // t2.setPriority(Thread.MIN_PRIORITY);
        // t3.setPriority(Thread.MIN_PRIORITY);
        // t4.setPriority(Thread.MIN_PRIORITY);
        // t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        // System.out.println("The ID of the thread is " + t.getId());
        // System.out.println("The name of the thread is " + t.getName());
        // System.out.println("The priority of the thread is " + t.getPriority());

        // newSpeed ns = new newSpeed();
        // newMyrun rn = new newMyrun(ns, "value");
        // rn.start();
        // System.out.println("ID is " + rn.getId() + " Name is " + rn.getName());
        // System.out.println("this is the prority " + rn.getPriority());

    }
    
}
