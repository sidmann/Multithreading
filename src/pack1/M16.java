package pack1;

public class M16 {
    static Runnable f1()
    {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++)
                {
                    System.out.println("run:" + i);
                }
            }
        };
        return r1;
    }

    public static void main(String[] args) {
        new Thread(f1()).start();
        new Thread(f1()).start();
        new Thread(f1()).start();
        new Thread(f1()).start();
    }
}
