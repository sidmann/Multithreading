package pack1;

public class M41 {
    static class A extends Thread
    {
        A(ThreadGroup tg, String name)
        {
            super(tg, name);
        }
        public void run()
        {
            for (int i = 1; i <= 1000; i++)
            {
                System.out.println(i + ":" + getName());
            }
        }
    }

    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("my first group");
        A a1 = new A(tg, "1st thread");
        A a2 = new A(tg, "2nd thread");
        A a3 = new A(tg, "3rd thread");
        A a4 = new A(tg, "4th thread");
        A a5 = new A(tg, "5th thread");
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
        try {
            Thread.sleep(1);
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        tg.stop();
    }
}
