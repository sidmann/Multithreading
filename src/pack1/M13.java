package pack1;

public class M13 {
    public static void main(String[] args) {
        class A implements Runnable
        {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++)
                {
                    System.out.println("run:" + i);
                }
            }
        }
        A a1 = new A();
        for (int i = 1; i <= 3; i++)
        {
            new Thread(a1).start();
        }
    }
}
