package pack1;

// deadlock condition
class Util {
    static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

class T {
    synchronized void test1(T obj) {
        System.out.println("test1 begin");
        Util.sleep(100);
        obj.test2(this);
        System.out.println("test1 end");
    }

    synchronized void test2(T obj) {
        System.out.println("test2 begin");
        Util.sleep(100);
        obj.test1(this);
        System.out.println("test2 end");
    }
}

public class M44 {
    static class A extends Thread {
        T t1, t2;

        A(T t1, T t2) {
            this.t1 = t1;
            this.t2 = t2;
        }

        @Override
        public void run() {
            t1.test1(t2);
        }
    }

    static class B extends Thread {
        T t1, t2;

        B(T t1, T t2) {
            this.t1 = t1;
            this.t2 = t2;
        }

        @Override
        public void run() {
            t2.test2(t1);
        }
    }

    public static void main(String[] args) {
        T t1 = new T();
        T t2 = new T();
        A a1 = new A(t1, t2);
        B b1 = new B(t1, t2);
        a1.start();
        b1.start();
        Util.sleep(1000);
        System.out.println("from main");
        System.out.println(a1.getState());
        System.out.println(b1.getState());
    }
}
// perfect deadlock official name to the deadlock condition is BLOCKED.
// getState() method is used to find out state of the thread.
// multiple threads communicating each other by using methods of one object.