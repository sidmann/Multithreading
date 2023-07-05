package pack1;

public class M37 {
    static class A extends Thread
    {
        @Override
        public void run() {
            Thread t1 = Thread.currentThread();
            System.out.println(t1.getId()); // ID can't be change.
            System.out.println(t1.getName());
            System.out.println(t1.getPriority());
            System.out.println(t1.isDaemon());
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.setName("abc");
        a1.start();
    }
}
