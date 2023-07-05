package pack1;

class R {
    int i;

    synchronized void test1() {
        Thread t1 = Thread.currentThread();
        for (; i <= 100; i++) {
            System.out.println(i + " from test1 by " + t1.getName());
        }
    }
}

public class M42 {
    static class A extends Thread {
        R r1;

        A(R r1) {
            this.r1 = r1;
        }

        @Override
        public void run() {
            r1.test1();
        }
    }

    static class B extends Thread {
        R r1;

        B(R r1) {
            this.r1 = r1;
        }

        @Override
        public void run() {
            r1.test1();
        }
    }

    public static void main(String[] args) {
        R r1 = new R();
        R r2 = new R();
        A a1 = new A(r2);
        B b1 = new B(r2);
        a1.start();
        b1.start();
    }
}
// more than one thread or two different threads working in the same object simultaneously at the same time not recommended, we will be getting a data inconsistency/ data corruption.
// synchronization is a process of allowing only one thread into an object at any time, more than one thread is not allowed into an object at any time.
// synchronization is a process of restricting object usage to one thread at any time.
// whenever thread is entering synchronized method, it requires object lock.
// every object will have only one object lock.