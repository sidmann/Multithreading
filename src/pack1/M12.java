package pack1;

public class M12 {
    class A implements Runnable
    {
        @Override
        public void run() {
            for (int i = 1; i < 1000; i++)
            {
                System.out.println("run:" + i);
            }
        }
    }

    public static void main(String[] args) {
        A a1 = new M12().new A();
        Thread t1;
        for (int i = 1; i <= 5; i++)
        {
            t1 = new Thread(a1);
            t1.start();
        }

    }
}
