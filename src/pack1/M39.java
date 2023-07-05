package pack1;

public class M39 {
    static class A extends Thread
    {
        @Override
        public void run() {
            Thread t1 = Thread.currentThread();
            System.out.println(t1.getId());
            System.out.println(t1.getName());
            System.out.println(t1.getPriority());
            System.out.println(t1.isDaemon());
        }
    }

    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        t1.setPriority(9);
        A a1 = new A();
        System.out.println(a1.getPriority());
        a1.setPriority(1);
        a1.start();
    }
}
