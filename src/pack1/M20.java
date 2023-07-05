package pack1;

public class M20 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++)
        {
            System.out.println("run:" + i);
        }
    }

    public static void main(String[] args) {
        M20 obj = new M20();
        new Thread(obj).start();
        new Thread(obj).start();
        new Thread(obj).start();
        new Thread(obj).start();
    }
}
