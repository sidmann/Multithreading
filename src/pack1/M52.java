package pack1;

public class M52 {
    static class A extends Thread {
        ThreadLocal t;  // ThreadLocal is available in java.lang package

        A(ThreadLocal t)   // ThreadLocal having get and set method
        {
            this.t = t;
        }

        public void run() {
            System.out.println("A1:" + t.get());  // call get() wherever we are reading value
            t.set(10);  // call set() wherever we are assigning value
            Util.sleep(200);

            System.out.println("A2:" + t.get());
            t.set(20);
            Util.sleep(200);

            System.out.println("A3:" + t.get());
            t.set(30);
            Util.sleep(200);

            System.out.println("A4:" + t.get());
            t.set(40);
            Util.sleep(200);
        }
    }

    static class B extends Thread {
        ThreadLocal t;

        B(ThreadLocal t) {
            this.t = t;
        }

        public void run() {
            System.out.println("B1:" + t.get());
            t.set(110);
            Util.sleep(200);

            System.out.println("B2:" + t.get());
            t.set(120);
            Util.sleep(200);

            System.out.println("B3:" + t.get());
            t.set(130);
            Util.sleep(200);

            System.out.println("B4:" + t.get());
            t.set(140);
            Util.sleep(200);
        }
    }

    public static void main(String[] args) {
        ThreadLocal t = new ThreadLocal();
        t.set(900);
        A a1 = new A(t);
        a1.start();
        Util.sleep(100);
        B b1 = new B(t);
        b1.start();
        Util.sleep(1000);
        System.out.println("main end:" + t.get());
    }
}

