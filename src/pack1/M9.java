package pack1;

class E implements Runnable  // it is a functional interface
{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++)
        {
            System.out.println(i);
        }
    }
}
public class M9 {    // Java provides two ways for multiple threads
    public static void main(String[] args) {
        E e1 = new E();
        Thread t1 = new Thread(e1);
        t1.start();
        for (int i = 2000; i < 3000; i++)
        {
            System.out.println(i);
        }
    }
}
