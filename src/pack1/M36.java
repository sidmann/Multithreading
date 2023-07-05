package pack1;

public class M36 {
    static class A extends Thread
    {
        @Override
        public void run() {
            for (int i = 1; i <= 1000; i++)
            {
                System.out.println(i);
            }
            Thread t1 = Thread.currentThread();
            System.out.println(t1.getId());
            System.out.println(t1.getName());
            System.out.println(t1.getPriority());
            System.out.println(t1.isDaemon());
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.start();
//        a1.run();
    }
}
