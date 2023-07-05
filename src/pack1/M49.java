package pack1;

public class M49 {

    static class B extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " started test1");
            synchronized (this) {
                try {
                    wait(); //when object lock is there then only wait method is executing
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " ended test1");
        }
    }

    static class C extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " started test1");
            synchronized (this) {
                try {
                    wait(); //when object lock is there then only wait method is executing
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " ended test1");
        }
    }

    public static void main(String[] args) {
        B b1 = new B();
        C c1 = new C();
        b1.start();
        c1.start();
        Util.sleep(10000);
        System.out.println("after main sleep");
        synchronized (b1) {
            b1.notifyAll();
        }
        synchronized (c1) {
            c1.notifyAll();
        }
    }
}
