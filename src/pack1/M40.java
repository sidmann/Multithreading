package pack1;

public class M40 {
    static class A extends Thread
    {
        @Override
        public void run() {
//            Thread t1 = Thread.currentThread();
//            System.out.println(t1.getId());
//            System.out.println(t1.getName());
//            System.out.println(t1.getPriority());
//            System.out.println(t1.isDaemon());
            for (int i = 80000; i <= 81000; i++)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.setDaemon(true);
        a1.start();
        for (int i = 0; i <= 1000; i++)
        {
            System.out.println(i);
        }
    }
}
