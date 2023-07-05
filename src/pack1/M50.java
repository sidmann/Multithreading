package pack1;

class U {
    static void test1() {
        System.out.println("test1 begin");
        synchronized (U.class) {
            for (int i = 0; i <= 100; i++) {
                System.out.println("test1: " + i + ":" + Thread.currentThread().getName());
            }
        }
    }
}

public class M50 {
    static class A extends Thread {
        @Override
        public void run() {
            U.test1();
        }
    }

    static class B extends Thread {
        @Override
        public void run() {
            U.test1();
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.start();
        B b1 = new B();
        b1.start();
    }
}


// every class will have one class lock.
// whenever class is loading to the memory class lock is created.
