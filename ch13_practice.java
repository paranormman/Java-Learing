class goodMorning extends Thread{
    public goodMorning(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        while(i < 100){
            System.out.println("Hello " + this.getName());
            i++;
            // try {
            //     Thread.sleep(200);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }
    }
}

// class Welcome extends Thread{
//     public void run(){
//         int i = 0;
//         while(i < 100){
//             System.out.println("Welcome");
//             i++;
//         }
//     }
// }

public class ch13_practice {
    public static void main(String[] args) {

        // Welcome wl = new Welcome();
        // wl.start();

        goodMorning gd1 = new goodMorning("Happy1 (High importance)");
        goodMorning gd2 = new goodMorning("Happy2");
        goodMorning gd3 = new goodMorning("Happy3 (Low)");
        goodMorning gd4 = new goodMorning("Happy4");
        gd1.setPriority(Thread.MAX_PRIORITY);
        gd3.setPriority(Thread.MIN_PRIORITY);
        System.out.println(gd1.getPriority());
        System.out.println(gd2.getPriority());
        System.out.println(gd3.getPriority());
        System.out.println(gd3.getState());
        System.out.println(Thread.currentThread().getState());
        gd1.start();
        gd2.start();
        gd3.start();
        System.out.println(gd3.getState());
        gd4.start();
        
    }
}
