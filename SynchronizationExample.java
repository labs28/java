public class SynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(new CounterTask(counter));
        Thread t2 = new Thread(new CounterTask(counter));
        Thread t3 = new Thread(new CounterTask(counter));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main interrupted");
        }

        System.out.println("Final count: " + counter.getValue());
    }

    static class Counter {
        private int value;

        public synchronized void increment() {
            value++;
        }

        public synchronized int getValue() {
            return value;
        }
    }

    static class CounterTask implements Runnable {
        private final Counter counter;

        public CounterTask(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
    }
}
