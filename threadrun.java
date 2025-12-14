
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread using Thread class is running");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface is running");
    }
}

public class Main {
    public static void main(String[] args) {

        MyThread obj = new MyThread();
        obj.start();   

        MyRunnable objs = new MyRunnable();
        Thread obj2 = new Thread(objs);
        obj2.start();
    }
}
