package pack1;

public class M11 {
    static class A implements Runnable
    {
        @Override
        public void run() {
            for (int i = 1; i < 1000; i++)
            {
                System.out.println("from run:" + i);
            }
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
        Thread t1 = new Thread(a1);
        t1.start();

        Thread t2 = new Thread(a1);
        t2.start();

        Thread t3 = new Thread(a1);
        t3.start();
    }
}
