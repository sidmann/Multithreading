package pack1;

public class M46 {
    static class A {
        void test1() {
            System.out.println(Thread.currentThread().getName() + " started test1");
            synchronized (this) {  // mutex - mutually exclusive
                try {
                    wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " ended test1");
        }

        void test2() {
            System.out.println(Thread.currentThread().getName() + " started test2");
            synchronized (this) {
                notifyAll();
            }
            System.out.println(Thread.currentThread().getName() + " ended test2");
        }
    }

    static class B extends Thread {
        A a1;

        B(A a1) {
            this.a1 = a1;
        }

        @Override
        public void run() {
            a1.test1();
        }
    }

    static class C extends Thread {
        A a1;

        C(A a1) {
            this.a1 = a1;
        }

        @Override
        public void run() {
            a1.test1();
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        B b1 = new B(a1);
        C c1 = new C(a1);
        b1.start();
        c1.start();
        Util.sleep(10000);
        System.out.println("after main sleep");
        a1.test2();
//        a2.test2();
    }
}
