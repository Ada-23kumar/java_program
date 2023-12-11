class exampractice1 extends Thread{
    private Thread t;
    private String threadName;
     exampractice1 (String name) {
        threadName = name;
        System.out.println("creating "+threadName);
     }
     public void run() {
        System.out.println("Running " +threadName);
        try {
            for(int i = 4; i>0; i--) {
                System.out.println("Thread: "+threadName+", "+i);
                Thread.sleep(50);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Thread: "+threadName+"interrupted.");
        }
        System.out.println("Thread "+threadName+"exiting.");
     }
     public void start() {
        System.out.println("String "+threadName);
        if(t==null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
public class exampractice {
    public static void main(String[]args) {
        ThreadDemo T1 = new ThreadDemo("Thread-1");
        T1.start();
        ThreadDemo T2 = new ThreadDemo("Thread-2");
        T2.start();
    }
}
