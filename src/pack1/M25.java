package pack1;

public class M25 {
    static class A extends Thread
    {
        @Override
        public void run() {
            Thread t1 = Thread.currentThread();
//            System.out.println(t1);
            for (int i = 1; i <= 1000; i++)
            {
                System.out.println(t1.getName() + ":" + i);
            }
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
//        System.out.println(a1);
        a1.start();
//        a1.run();
        for (int i = 1000; i <= 2000; i++)
        {
            System.out.println("main:" + i);
        }
    }
}
