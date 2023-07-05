package pack1;

public class M5 {
    public static void main(String[] args) {
        class E extends Thread
        {
            @Override
            public void run() {
                for (int i = 1; i < 1000; i++)
                {
                    System.out.println(getName() + ":" + i);
                }
            }
        }
        E e1 = new E();
        e1.start();
        E e2 = new E();
        e2.start();
        E e3 = new E();
        e3.start();
    }
}
