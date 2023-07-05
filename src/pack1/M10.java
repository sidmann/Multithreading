package pack1;

class F implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++)
        {
            System.out.println("from run:" + i);
        }
    }
}
public class M10 {
    public static void main(String[] args) {
        F f1 = new F();
        Thread t1 = new Thread(f1);
        t1.start();

        Thread t2 = new Thread(f1);
        t2.start();

        Thread t3 = new Thread(f1);
        t3.start();
    }
}
