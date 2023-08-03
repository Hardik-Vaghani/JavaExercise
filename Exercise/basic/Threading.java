package Exercise.basic;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class Threading {
    public static void main(String[] args) {
        MyThreading t = new MyThreading();
        MyThread t1 = new MyThread();

        t.start();
        t1.start();
        Handler h = new Handler() {
            @Override
            public void publish(LogRecord record) {
                System.out.println(record.getLevel());
                if (getLevel().equals("ALL")) {

                } else {

                    System.out.println("hello 1," + Thread.currentThread().getPriority());
                    System.out.println("hello 2," + Thread.currentThread().getPriority());
                    System.out.println("hello 3," + Thread.currentThread().getPriority());
                    System.out.println("hello 4," + Thread.currentThread().getPriority());
                    System.out.println("hello 5," + Thread.currentThread().getPriority());
                }
            }

            @Override
            public void flush() {
                System.out.println("hardik");
            }

            @Override
            public void close() throws SecurityException {
                System.out.println("is close");
            }
        };
        h.publish(new LogRecord(Level.CONFIG, "hi"));
        System.out.println(h.getLevel());
        h.flush();
        h.close();
    }
}

class MyThreading extends Thread {
    @Override
    public void run() {
        for (char i = 65; i < 70; i++) {
            try {
                sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + " " + Thread.currentThread().getPriority());
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 65; i < 70; i++) {
            try {
                sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + " " + Thread.currentThread().getPriority());
        }
    }
}
