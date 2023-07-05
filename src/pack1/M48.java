package pack1;

public class M48 {
    static class A {

    }

    static class B extends Thread {
        A a1;

        B(A a1) {
            this.a1 = a1;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " started test1");
            synchronized (a1) {
                try {
                    a1.wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " ended test1");
        }
    }

    static class C extends Thread {
        A a1;

        C(A a1) {
            this.a1 = a1;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " started test1");
            synchronized (a1) {
                try {
                    a1.wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " ended test1");
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B(a1);
        C c1 = new C(a1);
        b1.start();
        c1.start();
        Util.sleep(10000);
        System.out.println("after main sleep");
        synchronized (a1) {
            a1.notifyAll();
        }
    }
}
