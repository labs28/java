public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main thread: starting");

        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");

        Thread runnableThread1 = new Thread(new MyRunnable("Runnable-1"));
        Thread runnableThread2 = new Thread(new MyRunnable("Runnable-2"));

        thread1.start();
        thread2.start();
        runnableThread1.start();
        runnableThread2.start();

        try {
            thread1.join();
            thread2.join();
            runnableThread1.join();
            runnableThread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread: finished");
    }

    static class MyThread extends Thread {
        private final String threadName;

        public MyThread(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " (Thread) - step " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println(threadName + " interrupted");
                }
            }
            System.out.println(threadName + " (Thread) - done");
        }
    }

    static class MyRunnable implements Runnable {
        private final String taskName;

        public MyRunnable(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(taskName + " (Runnable) - task " + i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.out.println(taskName + " interrupted");
                }
            }
            System.out.println(taskName + " (Runnable) - done");
        }
    }
}
