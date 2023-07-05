package pack1;

public class M17 {
    static Runnable f1()
    {
        class A implements Runnable
        {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++)
                {
                    System.out.println("local inner-run:" + i);
                }
            }
        }
        return new A();
    }
    static Runnable f2()
    {
        return new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++)
                {
                    System.out.println("AIC run:" + i);
                }
            }
        };
    }

    public static void main(String[] args) {
        new Thread(f1()).start();
        new Thread(f2()).start();
    }
}
